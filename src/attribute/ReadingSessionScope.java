package attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/readingSessionScope" })
public class ReadingSessionScope extends HttpServlet {


	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer =resp.getWriter();
		writer.println(req.getSession().getAttribute("ramazan"));
		writer.println(req.getSession().getAttribute("zeynep"));
		writer.close();
	}
}
