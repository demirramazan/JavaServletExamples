package useBean;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Person;

@WebServlet(urlPatterns = { "/useBeanRequestImplicit" })
public class UseBeanRequestImplicit extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person person = new Person("ramazan", "demir", 28);
		req.setAttribute("person", person);

		RequestDispatcher dispatcher = req.getRequestDispatcher("param1.jsp");
		dispatcher.forward(req, resp);
	}
}
