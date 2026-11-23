package com.naveen.user;

import java.util.Scanner;

import com.naveen.DAO.StudentDAO;
import com.naveen.DAO.StudentDaoImpl;
import com.naveen.DTO.Student;

public class Delete {

	public static boolean delete(Student s) {
		
		Scanner sc = new Scanner(System.in);
		
		StudentDAO sd = new StudentDaoImpl();
		
		if(sd.deleteStudent(s)) {
			System.out.println("Successfully Deleted...");
			return true;
		}
		else {
			System.out.println("Deletion Failed!!!");
			return false;
		}
		
	}
	
}
