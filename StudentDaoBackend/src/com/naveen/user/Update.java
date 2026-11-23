package com.naveen.user;

import java.util.Scanner;

import com.naveen.DAO.StudentDAO;
import com.naveen.DAO.StudentDaoImpl;
import com.naveen.DTO.Student;

public class Update {
	
	public static void update(Student s) {
		
		Scanner sc = new Scanner(System.in);
		
		StudentDAO sd = new StudentDaoImpl();
		
		System.out.println("Enter new Name: ");
		s.setSname(sc.next());
		
		System.out.println("Enter new Branch: ");
		s.setBranch(sc.next());
		
		System.out.println("Enter new Location: ");
		s.setLocation(sc.next());
		
		if(sd.updateStudent(s)) {
			System.out.println("Update Successfully...");
		}
		else {
			System.out.println("Update Failed!!!S");
		}
		
		
	}
	
}
