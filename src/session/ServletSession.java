package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns={"/ServletSession"})
public class ServletSession extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter writer=resp.getWriter();
	
	HttpSession httpSession=req.getSession();
	if (httpSession.isNew()) {
		writer.println("new session");
	} else {
		writer.println("old session");
	}
}
}
