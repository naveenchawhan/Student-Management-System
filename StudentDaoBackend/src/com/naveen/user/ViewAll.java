package com.naveen.user;

import java.util.ArrayList;

import com.naveen.DAO.StudentDAO;
import com.naveen.DAO.StudentDaoImpl;
import com.naveen.DTO.Student;

public class ViewAll {

	public static void viewall() {
		
		StudentDAO sd = new StudentDaoImpl();
		
		ArrayList<Student> students = sd.getStudent();
		
		if(students.isEmpty()) {
			System.out.println("No Student Record Found...");
		}
		else {
			for(Student s : students) {
				System.out.println(s);
			}
		}
		
	}
	
}
