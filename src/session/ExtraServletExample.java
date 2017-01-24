package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/ExtraServletExample" })
public class ExtraServletExample extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();

		String heading;
		Integer accessCount = (Integer) session.getAttribute("accessCount");
		if (accessCount != null) {
			accessCount++;
		} else {
			accessCount = 0;
		}

		session.setAttribute("accessCount", accessCount);

		String id = session.getId();
		Date creationTime = new Date(session.getCreationTime());
		Date lastAccessedTime = new Date(session.getLastAccessedTime());
		Integer maxInactiveInternal = session.getMaxInactiveInterval();

		PrintWriter writer = resp.getWriter();
		writer.write("<html><body><table>");
		writer.write("<tr><td> Session ID: </td>");
		writer.write("<td> " + id + " </td> </tr>");
		writer.write("<tr><td> Creation Time: </td>");
		writer.write("<td> " + creationTime + " </td></tr>");
		writer.write("<tr><td> Last Accessed Time: </td>");
		writer.write("<td> " + lastAccessedTime + " </td></tr>");
		writer.write("<tr><td> Max Inactive Internal Time: </td>");
		writer.write("<td> " + maxInactiveInternal + " </td></tr>");
		writer.write("<tr><td> Access COunt: </td>");
		writer.write("<td> " + accessCount + " </td></tr>");
		writer.write("</table></body></html>");
	}
}
