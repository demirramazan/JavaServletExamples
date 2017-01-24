package servletConfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigClass extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		resp.getWriter().write(config.getInitParameter("mustafaAbi"));
		resp.getWriter().write("<br/> Servlet Name: "+config.getServletName());
		
	}

}
