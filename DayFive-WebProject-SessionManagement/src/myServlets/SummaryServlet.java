package myServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;

public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SummaryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		if (session != null) {
			
			User user = (User) session.getAttribute("userDetail");
			out.println("<h3> User Details : </h3>" + user);
			out.println("<br/><br/>");
			out.println("<h3>Session Created Time : </h3>" + new Date(session.getCreationTime()));
			out.println("<br/><br/>");
			out.println("<h3>Session Id : </h3>" + session.getId());
			
		}
	}
}
