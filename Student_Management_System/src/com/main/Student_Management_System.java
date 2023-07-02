package com.main;

import java.util.*;
import com.controller.StudentController;

public class Student_Management_System {

	public static void main(String[] args) {

		StudentController sr = new StudentController();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to student management portal");
		System.out.println("=============================================================================");
		char ch;
		do {
			System.out.println(" Press 1 for Add student into the system");
			System.out.println(" Press 2 for Delete student from system");
			System.out.println(" Press 3 for Display list of students");
			System.out.println(" Press 4 for display student info by course name");
			System.out.println(" Press 5 for display student info by student name");
			System.out.println(" Pls enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				sr.operation(1);
				break;
			case 2:
				sr.operation(2);
				break;
			case 3:
				sr.operation(3);
				break;
			case 4:
				sr.operation(4);
				break;
			case 5:
				sr.operation(5);
				break;
			default:
				System.out.println("Invalid input");
			}
			System.out.println("Do you want to continue,if yes press y else press n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		System.out.println("Thanks for using application..........");
	}

}
