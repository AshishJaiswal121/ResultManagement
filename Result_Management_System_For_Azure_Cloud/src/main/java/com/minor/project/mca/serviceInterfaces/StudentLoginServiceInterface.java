package com.minor.project.mca.serviceInterfaces;

import com.minor.project.mca.Bean.StudentResultRecord;

public interface StudentLoginServiceInterface {
	public StudentResultRecord checkStudentLogin(String rollno, String dob);

}
