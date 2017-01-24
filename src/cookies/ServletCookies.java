package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servletCookies" })
public class ServletCookies extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("araba", "BMW");
		Cookie cookie2 = new Cookie("araba2", "Mercedes");

		cookie2.setMaxAge(15);

		resp.addCookie(cookie);
		resp.addCookie(cookie2);

		resp.addHeader("Set-Cookie", "araba3=AUDI");
		
		Cookie[] cookies=req.getCookies();
		if (cookies!=null) {
			for (Cookie cookie3 : cookies) {
				System.out.println("Cookie adi: "+cookie3.getName()+" Cookie degeri: "+ cookie3.getValue());
			}
		}
	}
}
