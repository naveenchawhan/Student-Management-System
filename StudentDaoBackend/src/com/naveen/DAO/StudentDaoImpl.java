package com.naveen.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.naveen.DTO.Student;
import com.naveen.connectivity.Connect;

public class StudentDaoImpl implements StudentDAO {
	
	Connection con = null;
	public StudentDaoImpl() {
		con = Connect.getConn();
	}

	@Override
	public boolean insertStudent(Student s) {
		PreparedStatement ps = null;
		String query = "INSERT INTO STUDENT VALUES(0,?,?,?,?,?,?,SYSDATE())";
		
		int res = 0;
		
		try {
			ps = con.prepareStatement(query);
//			String name = s.getSname();
//			ps.setString(1, name);
			ps.setString(1, s.getSname());
			ps.setLong(2, s.getPhone());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getBranch());
			ps.setString(5, s.getLocation());
			ps.setString(6, s.getPassword());
			
			res = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(res > 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		
		String query = "UPDATE STUDENT SET SNAME = ?, BRANCH = ?, LOCATION = ? WHERE SID = ?";
		
		PreparedStatement ps = null;
		
		int res = 0;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, s.getSname());
			ps.setString(2, s.getBranch());
			ps.setString(3, s.getLocation());
			ps.setInt(4, s.getSid());
			
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(res > 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deleteStudent(Student s) {
		
		String query = "DELETE FROM STUDENT WHERE SID = ?";
		
		PreparedStatement ps = null;
		
		int res = 0;
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, s.getSid());
			
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(res > 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public Student getStudent(String email, String password) {
		
		String query = "SELECT * FROM STUDENT WHERE EMAIL = ? AND PASSWORD = ?";
		
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		Student s = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				s = new Student();
				
//				int id = rs.getInt("sid");
//				s.setSid(id);
				
				s.setSid(rs.getInt("sid"));
				s.setSname(rs.getString("sname"));
				s.setPhone(rs.getLong("phone"));
				s.setEmail(rs.getString("email"));
				s.setBranch(rs.getString("branch"));
				s.setLocation(rs.getString("location"));
				s.setPassword(rs.getString("password"));
				s.setDate(rs.getString("date"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return s;
	}

	@Override
	public Student getStudent(long phone, String email) {
		String query = "SELECT * FROM STUDENT WHERE PHONE = ? AND EMAIL = ?";
		
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		Student s = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, phone);
			ps.setString(2, email);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				s = new Student();
				
//				int id = rs.getInt("sid");
//				s.setSid(id);
				
				s.setSid(rs.getInt("sid"));
				s.setSname(rs.getString("sname"));
				s.setPhone(rs.getLong("phone"));
				s.setEmail(rs.getString("email"));
				s.setBranch(rs.getString("branch"));
				s.setLocation(rs.getString("location"));
				s.setPassword(rs.getString("password"));
				s.setDate(rs.getString("date"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}

	@Override
	public ArrayList<Student> getStudent() {
		
		String query = "SELECT * FROM STUDENT";
		
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		
		ArrayList<Student> students = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(query);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				
				s.setSid(rs.getInt("sid"));
				s.setSname(rs.getString("sname"));
				s.setPhone(rs.getLong("phone"));
				s.setEmail(rs.getString("email"));
				s.setBranch(rs.getString("branch"));
				s.setLocation(rs.getString("location"));
				s.setPassword(rs.getString("password"));
				s.setDate(rs.getString("date"));
				
				students.add(s);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return students;
	}

}
