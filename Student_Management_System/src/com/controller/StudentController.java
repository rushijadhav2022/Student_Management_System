package com.controller;

import com.service.Student_not_found_Exception;
import com.service_implementation.Student_Service_Implemetation;

public class StudentController {

	private Student_Service_Implemetation st;

	public StudentController() {
		this.st = new Student_Service_Implemetation();
	}

	public void operation(int option) {
		switch (option) {
		case 1:
			st.add();
			break;
		case 2:

			try {
				st.delete();
			} catch (Student_not_found_Exception e) {

				e.getMessage();
			}

			break;
		case 3:
			try {
				st.display();
			} catch (Student_not_found_Exception e) {
				e.getMessage();
			}
			break;
		case 4:

			try {
				st.displayByCourse();
			} catch (Student_not_found_Exception e) {
				e.getMessage();
			}
			break;
		case 5:
			try {
				st.searchByName();
			} catch (Student_not_found_Exception e) {
				e.getMessage();
			}
			break;
		default:
			System.out.println("invalid option");
		}

	}
}
