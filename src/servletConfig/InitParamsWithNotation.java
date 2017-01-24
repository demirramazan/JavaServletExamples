package servletConfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "initParamsWithNotation", urlPatterns = { "/initParams" }, initParams = {
		@WebInitParam(name = "rdemir", value = "Ramazan Demir"),
		@WebInitParam(name = "mustafaAbi", value = "Mustafa Karaman") })
public class InitParamsWithNotation extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		ServletConfig config = getServletConfig();
		Enumeration<String> enumeration = config.getInitParameterNames();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			printWriter.write(string);
			printWriter.write("<br/>");
		}
		printWriter.write(" "+config.getInitParameter("mustafaAbi")+"<br/>");
		printWriter.write(" "+config.getInitParameter("rdemir")+"<br/>");
		

	}
}
