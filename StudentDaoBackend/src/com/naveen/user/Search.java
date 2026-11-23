package com.naveen.user;

import java.util.Scanner;

import com.naveen.DAO.StudentDAO;
import com.naveen.DAO.StudentDaoImpl;
import com.naveen.DTO.Student;

public class Search {

	public static void search() {
		
		Scanner sc = new Scanner(System.in);
		
		StudentDAO sd = new StudentDaoImpl();
		
		System.out.println("Enter Phone Number:");
		long phone = sc.nextLong();
		
		System.out.println("Enter Email:");
		String email = sc.next();
		
		Student s = sd.getStudent(phone, email);
		
		if(s != null) {
			System.out.println("Found Record...");
			System.out.println(s);
		}
		else {
			System.out.println("Record is not present!!!!");
		}
		
		
		
	}
	
}
