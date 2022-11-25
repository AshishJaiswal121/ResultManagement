package com.minor.project.mca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minor.project.mca.Bean.Teacher;
import com.minor.project.mca.Model.TeacherModel;
import com.minor.project.mca.serviceInterfaces.TeacherLoginInterface;

@Service
public class TeacherLoginService implements TeacherLoginInterface {

	@Autowired
	TeacherModel teacherModel;

	@Override
	public boolean teacherLoginCheck(Teacher teacher) {
		List<Teacher> allTeacher = teacherModel.findAll();
		Optional<Teacher> result = allTeacher.stream()
				.filter(t -> t.getEmail().equals(teacher.getEmail()) && t.getPassword().equals(teacher.getPassword()))// filtering
																														// data
																														// //
				// fetching price
				.findAny();
		if (!result.isEmpty()) {
			return true;
		} else {
			System.out.println("hahhaha");
			return false;
		}

	}

}
