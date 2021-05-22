package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h3>Accessing Parameters of ServletConfig in FirstServlet: </h3>");
		ServletConfig config = getServletConfig();
		out.println("Message : " + config.getInitParameter("Message"));
		out.println("<br /><br />");
		out.println("Command : " + config.getInitParameter("Command"));
		
		out.println("<h3>Accessing Parameters of ServletContext in FirstServlet: </h3>");
		ServletContext context = getServletContext();
		out.println("URL : " + context.getInitParameter("URL"));
		out.println("<br /><br />");
		out.println("Driver Name : " + context.getInitParameter("Driver"));
		
	}

}
