package com.minor.project.mca.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentResultRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String rollno;
	private String name;
	private String dob;
	private int physics;
	private int chemistry;
	private int maths;
	private int hindi;
	private int english;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public StudentResultRecord(int id, String rollno, String name, String dob, int physics, int chemistry, int maths,
			int hindi, int english) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.dob = dob;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
		this.hindi = hindi;
		this.english = english;
	}

	public StudentResultRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentResultRecord [id=" + id + ", rollno=" + rollno + ", name=" + name + ", dob=" + dob + ", physics="
				+ physics + ", chemistry=" + chemistry + ", maths=" + maths + ", hindi=" + hindi + ", english="
				+ english + "]";
	}

}