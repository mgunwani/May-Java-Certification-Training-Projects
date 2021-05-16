package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uname = request.getParameter("username");
		String upass = request.getParameter("password");
		if(uname.equals("bhawna") && upass.equals("gunwani")) {
			out.write("<h4>You are successfully logged in.</h4>");
		} else {
			out.write("<h4 style='color:red'>Invalid Credentials. Please Try Again</h4>");
		}
	
	}

}
