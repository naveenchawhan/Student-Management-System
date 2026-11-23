package com.naveen.user;

import java.util.Scanner;

import com.naveen.DAO.StudentDAO;
import com.naveen.DAO.StudentDaoImpl;
import com.naveen.DTO.Student;

public class Login {
	
	public static void login() {
		
		Scanner sc = new Scanner(System.in);
		
		StudentDAO sd = new StudentDaoImpl();
		
		System.out.println("Enter email:");
		String email = sc.next();
		
		System.out.println("Enter password:");
		String password = sc.next();
		
		Student s = sd.getStudent(email, password);
		
		if(s != null) {
			System.out.println("Login Successful...");
			
			while(true) {
				System.out.println("1.View Profile");
				System.out.println("2.Update");
				System.out.println("3.Delete");
				System.out.println("4.Search");
				System.out.println("5.View All Students");
				System.out.println("6.Exit");
				
				int choice = sc.nextInt();
				
				switch (choice) {
					case 1: 
						System.out.println(s);
						break;
					case 2:
						Update.update(s);
						break;
					case 3:
						if(Delete.delete(s)) {
							return;
						}
						break;
					case 4:
						Search.search();
						break;
					case 5:
						ViewAll.viewall();
						break;
					case 6:
						System.exit(0);
						break;
				
				default:
					System.out.println("Invalid Choice...");
				}
			}
			
			
		}
		else {
			System.out.println("Login Failed...");
		}
		
		
	}
	
}
