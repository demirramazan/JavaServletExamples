package attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/readingContextScope" })
public class ReadingContextScope extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer =resp.getWriter();
		writer.println(getServletContext().getAttribute("ramazan"));
		writer.println(getServletContext().getAttribute("zeynep"));
		writer.close();
	}
}