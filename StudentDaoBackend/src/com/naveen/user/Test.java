package com.naveen.user;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. SignUp");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				SignUp.signup();
			break;
			case 2:
				Login.login();
			break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid Choice...");
			
			}
		}
		
	}
}
