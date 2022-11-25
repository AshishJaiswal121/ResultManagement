package com.minor.project.mca.serviceInterfaces;

import java.util.List;

import com.minor.project.mca.Bean.StudentResultRecord;

public interface StudentResultRecordServiceInterface {
	public List<StudentResultRecord> getAllStudentRecords();

	public boolean saveStudentRecord(StudentResultRecord studentResultRecord);

}
