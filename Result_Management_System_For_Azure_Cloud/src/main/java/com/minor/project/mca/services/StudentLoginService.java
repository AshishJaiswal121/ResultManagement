package com.minor.project.mca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minor.project.mca.Bean.StudentResultRecord;
import com.minor.project.mca.Model.StudentResultRecordModel;
import com.minor.project.mca.serviceInterfaces.StudentLoginServiceInterface;

@Service
public class StudentLoginService implements StudentLoginServiceInterface {
	@Autowired
	StudentResultRecordModel studentResultRecordModel;

	@Override
	public StudentResultRecord checkStudentLogin(String rollno, String dob) {
		List<StudentResultRecord> studentResultRecord = studentResultRecordModel.findAll();

		System.out.println(rollno);
		System.out.println(dob);
		studentResultRecord.stream().forEach(System.out::println);
		Optional<StudentResultRecord> studentResultRecordNew = studentResultRecord.stream()
				.filter(std -> std.getDob().equals(dob) && std.getRollno().equals(rollno)).findAny();
		if (!studentResultRecordNew.isEmpty())
			return studentResultRecordNew.get();
		else {
			return null;
		}
	}
}
