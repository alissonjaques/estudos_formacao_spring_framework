package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hey")
public class HelloWorldServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
	        PrintWriter out = resp.getWriter();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("Hello World! Congratulations, you wrote the first servlets.");
	        out.println("</body>");
	        out.println("</html>");
	        System.out.println("The servlet HelloWorldServlet was called.");
		}
}
