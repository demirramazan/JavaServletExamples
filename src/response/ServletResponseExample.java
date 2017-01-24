package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servletResponseExample" })
public class ServletResponseExample extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			resp.setCharacterEncoding("ISO-8859-9");
//			resp.setContentType("text/html;charset=ISO-8859-9");
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter printWriter = resp.getWriter();
			printWriter.write("<html>");
			printWriter.write("<head><meta charset='UTF-8'></head><body>");
			printWriter.write("<p>akküþkýþtemürçöðüþgil</p>");
			printWriter.write("</body></html>");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
