package downloading;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadingWithServlet
 */
@WebServlet(name = "DownloadingWithServlet",urlPatterns = "/downloadingWithServlet")
public class DownloadingWithServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DownloadingWithServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setHeader("Content-Disposition", "attachment;filename=htmldosyasi.html");
		
		InputStream stream=getServletContext().getResourceAsStream("/index.html");
		int read=0;
		byte[] bs=new byte[1024];
		ServletOutputStream outputStream=response.getOutputStream();
		if (stream != null) {
			while ((read=stream.read(bs))!=-1) {
				outputStream.write(bs,0,read);
			}
			
		}
		outputStream.close();
		
	}

}
