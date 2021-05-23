package com.bhawnagunwani;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhawnagunwani.dao.EmployeeDAO;
import com.bhawnagunwani.models.Employee;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmployeeDAO employeeDAO = new EmployeeDAO();
 
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		
		try {
			
			switch(action) {
			
			case "newEmployee":
				addNewEmployee(request, response);
				break;
				
			case"listEmployee":
				listEmployees(request, response);
				break;
				
			default:
				// addNewEmployee(request, response);
				listEmployees(request, response);
				break;
				
			}
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	private void addNewEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// PrintWriter out = response.getWriter();
		// out.println("Getting Employee Add Form Here");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee-add.jsp");
		dispatcher.forward(request, response);
		
	}

	private void listEmployees(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		List<Employee> empList = employeeDAO.getAllEmployees();
		System.out.println(empList);
		
		request.setAttribute("employees", empList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
	}

}
