package com.service;

public class Student_not_found_Exception extends RuntimeException {

	public Student_not_found_Exception() {

		System.out.println("No record found ");

	}

	public Student_not_found_Exception(String msg) {

		super(msg);

	}

}
