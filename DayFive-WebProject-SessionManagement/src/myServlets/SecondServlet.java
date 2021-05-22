package myServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		if(session != null) {
			
			User user = (User) session.getAttribute("userDetail");
			user.setAge(Integer.parseInt(request.getParameter("age")));
			user.setEmail(request.getParameter("email"));
			out.println(user);
			
			session.setAttribute("userDetail", user);
			response.sendRedirect("third.jsp");
			
			
		} else {
			out.println("No Session avaiable..");
		}
		
	}

}
