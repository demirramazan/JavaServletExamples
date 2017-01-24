package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/SessionTimeout" })
public class SessionTimeout extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();

		Integer maxInactiveInternal = httpSession.getMaxInactiveInterval();
		System.out.println("default timeout: " + maxInactiveInternal);
		// 0,-1 girildiginde sonsuz süre
		httpSession.setMaxInactiveInterval(-1);

		maxInactiveInternal = httpSession.getMaxInactiveInterval();
		System.out.println("update timeout: " + maxInactiveInternal);

		httpSession.setAttribute("ramazan", "demir");
		System.out.println((String) httpSession.getAttribute("ramazan"));
		System.out.println((String) httpSession.getAttribute("ramazan"));
		System.out.println((String) httpSession.getAttribute("ramazan"));

		PrintWriter pw = resp.getWriter();

		pw.print("<a href=sessiontimeoutcheck>check me</a>");
	}
}
