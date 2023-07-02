package com.service_implementation;

import java.util.*;
import com.service.*;

public class Student_Service_Implemetation implements StudentManagement {
	Course c = new Course();

	Student stud = new Student();
	ArrayList<Student> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int size;

	@Override
	public void add() {

		System.out.println("Please enter the size to store students");
		size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter id of student");
			int s_id = sc.nextInt();
			// stud.setS_id(s_id);
			System.out.println("Please enter name of student");
			String s_name = sc.next();
			// stud.setS_name(s_name);
			System.out.println("Please enter the grade of student");
			double s_grade = sc.nextDouble();
			// stud.setGrade(s_grade);
			System.out.println("Please enter course id");
			int c_id = sc.nextInt();
			stud.setC(c);
			// c.setC_id(c_id);
			System.out.println("Please enter course name");
			String c_name = sc.next();
			// stud.setC(c);
			c.setC_name(c_name);

//			stud.getS_id();
//			stud.getS_name();
//			stud.getGrade();
//			stud.getC().getC_id();
//			stud.getC().getC_name();
			Student stud = new Student(s_id, s_name, s_grade, new Course(c_id, c_name));
			al.add(stud);
//			
		}
		System.out.println(al);

	}

	public void delete() {

		System.out.println("Please enter id of student that you want to delete");
		int stud_id = sc.nextInt();
		boolean isPresent = false;
		if (al.isEmpty()) {
			throw new Student_not_found_Exception();
		} else {
			for (int i = 0; i < al.size(); i++) {
				if (stud_id == al.get(i).getS_id()) {
					al.remove(i);
					System.out.println("removed successfully");
				} else {
					throw new Student_not_found_Exception();
				}
			}
		}

	}

	public void searchByName() {
		System.out.println("Please enter student name that u have to search");
		String st_name = sc.next();

		if (al.isEmpty()) {
			throw new Student_not_found_Exception();
		} else {
			Iterator<Student> itr = al.iterator();
			while (itr.hasNext()) {
				Student sname = itr.next();
				if (st_name.equalsIgnoreCase(sname.getS_name())) {
					System.out.println(sname);
				} else {
					throw new Student_not_found_Exception();
				}
			}
		}
	}

	public void display() {
		if (al.isEmpty()) {
			throw new Student_not_found_Exception();
		} else {
			for (Student stud : al) {

				System.out.println(stud.getS_id() + " " + stud.getS_name() + " " + stud.getGrade() + " "
						+ stud.getC().getC_id() + " " + stud.getC().getC_name());

			}
		}

	}

	public void displayByCourse() throws Student_not_found_Exception {
		System.out.println("pls enter course name");
		String course_name = sc.next();
		if (al.isEmpty()) {
			throw new Student_not_found_Exception();
		} else {
			// throw new Student_not_found_Exception();
			for (Student stud : al) {
				if (course_name.equals(stud.getC().getC_name())) {
					System.out.println(stud);
				} else {
					throw new Student_not_found_Exception();
				}
			}
		}
	}

}
