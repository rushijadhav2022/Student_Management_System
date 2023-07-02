package com.service;

public class Student {

	 int s_id;
	 String s_name;
	 double grade;
	 Course c;
	 
	 

	public Student() {
		super();
	}

	public Student(int s_id, String s_name, double grade, Course c) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.grade = grade;
		this.c = c;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", grade=" + grade + ", c=" + c + "]";
	}

}
