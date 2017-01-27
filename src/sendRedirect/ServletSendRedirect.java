package sendRedirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletSendRedirect",urlPatterns = { "/servletSendRedirect" })
public class ServletSendRedirect extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		try {
			response.sendRedirect("http://www.sorularlarisale.com");
//			response.sendRedirect("Hello.jsp");
//			response.sendRedirect("/index.jsp");//absolute path
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
