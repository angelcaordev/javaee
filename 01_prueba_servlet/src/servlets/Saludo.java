package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
@WebServlet("/Saludo")
public class Saludo extends HttpServlet {
	/**
	 * Este es un método del ciclo de vida
	 */
	
	private int n;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><center>");
		n++;
		for(int i = 10;i<=50;i+=5) {
			out.println("<p style='font-size:"+i+"px'>Bienvenido a mi Servlet" + n);
		}
		out.println("</p></center></body></html>");
	}

}
