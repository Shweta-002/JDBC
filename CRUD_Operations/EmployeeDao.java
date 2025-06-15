package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
	
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		Statement s = c.createStatement();
		int result = s.executeUpdate("insert into employee(Name,Designation) values('Sharvi','Database Engineer')");
		if(result > 0) {
			System.out.println("Record inserted successfully....!");
		}else {
			System.out.println("Record Not inserted....");
		}
	}
	
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		Statement s = c.createStatement();
		int result = s.executeUpdate("update employee set Designation='Data Analytics' where ID=8");
		if(result > 0) {
			System.out.println("Record updated successfully....");
		}else {
			System.out.println("Not updated.....");
		}
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		Statement s = c.createStatement();
		int result = s.executeUpdate("delete from employee where ID=3");
		if(result > 0) {
			System.out.println("Record deleted successfully....");
		}else {
			System.out.println("Not deleted.....");
		}
		
	}
	
	public void showData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from employee");
		System.out.println("-------Fetching the records from column table-------");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
	}

}
