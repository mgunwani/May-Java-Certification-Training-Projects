package com.bhawnagunwani.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bhawnagunwani.models.Employee;

public class EmployeeDAO {

	public List<Employee> getAllEmployees() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?autoReconnect=true&SSL=false", "root", "password@123456");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM employees;");
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getFloat(3));
				employeeList.add(employee);
			}
			connection.close();
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return employeeList;
		
	}
	
}
