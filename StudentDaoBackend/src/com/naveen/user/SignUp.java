package com.naveen.user;

import java.util.Scanner;

import com.naveen.DAO.StudentDAO;
import com.naveen.DAO.StudentDaoImpl;
import com.naveen.DTO.Student;

public class SignUp {

	public static void signup() {
		
		Student s1 = new Student();
		
		StudentDAO sd = new StudentDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
//		String name = sc.next();
//		s1.setSname(name);
		s1.setSname(sc.next());
		
		System.out.println("Enter phone: ");
//		long phone = sc.nextLong();
//		s1.setPhone(phone);
		s1.setPhone(sc.nextLong());
		
		System.out.println("Enter email: ");
//		String email = sc.next();
//		s1.setEmail(email);
		s1.setEmail(sc.next());
		
		System.out.println("Enter branch: ");
//		String branch = sc.next();
//		s1.setBranch(branch);
		s1.setBranch(sc.next());
		
		System.out.println("Enter location: ");
//		String loc = sc.next();
//		s1.setLocation(loc);
		s1.setLocation(sc.next());
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		System.out.println("Confirm password: ");
		String conf = sc.next();
		
		if(password.equals(conf)) {
			s1.setPassword(password);
			
			if(sd.insertStudent(s1)) {
				System.out.println("SignUp Successfully...");
			}
			else {
				System.out.println("Failed to SignUp");
			}
			
			
		}
		else {
			System.out.println("Password Mismatch !!!");
		}
		
	}
	
}
