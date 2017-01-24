package servletContext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextExample extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String website = context.getInitParameter("website");

		PrintWriter writer = resp.getWriter();
		writer.write(website);
		
		Enumeration<String> enumeration = context.getInitParameterNames();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			writer.write(string);
			writer.write("<br/>");
		}
		writer.write(" "+context.getInitParameter("website")+"<br/>");
		writer.write(" "+context.getInitParameter("email")+"<br/>");
		
		writer.close();
	}
}
