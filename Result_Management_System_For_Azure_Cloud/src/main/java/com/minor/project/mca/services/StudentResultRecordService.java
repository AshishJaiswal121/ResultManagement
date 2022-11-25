package com.minor.project.mca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minor.project.mca.Bean.StudentResultRecord;
import com.minor.project.mca.Model.StudentResultRecordModel;
import com.minor.project.mca.serviceInterfaces.StudentResultRecordServiceInterface;

@Service
public class StudentResultRecordService implements StudentResultRecordServiceInterface {

	@Autowired
	StudentResultRecordModel studentResultRecordModel;

	@Override
	public List<StudentResultRecord> getAllStudentRecords() {
		return studentResultRecordModel.findAll();

	}

	@Override
	public boolean saveStudentRecord(StudentResultRecord studentResultRecord) {
		StudentResultRecord studentResultRecords = studentResultRecordModel.save(studentResultRecord);
		if (studentResultRecords != null)
			return true;
		else
			return false;
	}

	public void deleteResultRecord(int id) {
		studentResultRecordModel.deleteById(id);

	}

	public StudentResultRecord findResultRecordById(int id) {
		Optional<StudentResultRecord> studentResultRecord = studentResultRecordModel.findById(id);
		if (!studentResultRecord.isEmpty())
			return studentResultRecord.get();

		else
			return null;

	}
}
