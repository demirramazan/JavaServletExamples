package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CookieTimeOut",urlPatterns = { "/CookieTimeOut" })
public class CookieTimeOut extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("username", "demir");
		// cookie.setMaxAge(10); // 10 saniye sonra cookie silinsin
		resp.addCookie(cookie);
		String string = req.getContextPath();
		String url = req.getContextPath() + "/CookieTimeOutCheck";
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("<a href=\"" + url + "\">Click Me</a>");
	}
}
