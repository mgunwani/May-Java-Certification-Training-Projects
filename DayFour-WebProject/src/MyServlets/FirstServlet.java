package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

    /*
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Hello World - Service Method");
		PrintWriter out = response.getWriter();
		out.write("Hello World - Service Method");
	}
	*/
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Hello World - Get method");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<h2>Hello World - Get Method<h2>");
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Hello World - POST method");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<h2>Hello World - POST Method<h2>");
	}
	

}
