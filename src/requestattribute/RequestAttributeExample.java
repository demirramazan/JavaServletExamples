package requestattribute;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/RequestAttributeExample"})
public class RequestAttributeExample extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person person = new Person(1, "ramazan", "demir", 12345);
		Person person2 = new Person(2, "zeynep", "demir", 56789);

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(person);
		personList.add(person2);
		
		req.setAttribute("personList", personList);
		
//		RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/index.jsp");
		if (dispatcher != null) {
			dispatcher.forward(req, resp);
		}
	}
}
