package com.minor.project.mca.Model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minor.project.mca.Bean.Teacher;

public interface TeacherModel extends JpaRepository<Teacher, Integer> {

}
