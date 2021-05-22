package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uname = request.getParameter("username");
		String upass = request.getParameter("password");
		RequestDispatcher rd = null;
		if(uname.equals("admin") && upass.equals("123456")) {
			rd = request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			out.println("<h3 style='color:red;'>Invalid Credentials.. Please Try Again..!!</h3>");
		}
	}

}
