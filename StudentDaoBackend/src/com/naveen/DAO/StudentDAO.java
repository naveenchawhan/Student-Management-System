package com.naveen.DAO;

import java.util.ArrayList;

import com.naveen.DTO.Student;

public interface StudentDAO {
	
	public boolean insertStudent(Student s);
	
	public boolean updateStudent(Student s);
	
	public boolean deleteStudent(Student s);
	
	public Student getStudent(String email, String password);
	
	public Student getStudent(long phone, String email);
	
	public ArrayList<Student> getStudent();
	
}
