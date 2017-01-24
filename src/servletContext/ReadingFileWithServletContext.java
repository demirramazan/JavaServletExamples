package servletContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ReadingFileWithServletContext", urlPatterns = { "/ReadingFileWithServletContext" })
public class ReadingFileWithServletContext extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ServletContext context = getServletContext();

		InputStream txtstream = context.getResourceAsStream("/WEB-INF/graymoud_servis_code.txt");
		InputStream prostream = context.getResourceAsStream("/WEB-INF/nameSurname.properties");

		Properties properties = new Properties();
		properties.load(prostream);

		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("surname"));
		
		int content;
		ServletOutputStream outputStream=response.getOutputStream();
		while ((content=txtstream.read())!=-1) {
			outputStream.write(content);
		}

	}

}
