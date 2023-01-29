package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	int i = 0;
		int j = 0;
		try {
			i = Integer.parseInt(request.getParameter("num1"));
			j = Integer.parseInt(request.getParameter("num2"));
			int k = i + j;
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang=\"en\">");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
			out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			out.println("<title>Document</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div>Result of summing " + i + " and " + j + " equals: " + k + "</div");
			out.println("<div><button onclick=\"window.location.href='index.html';\">Back to HomePage</button></div>");
			out.println("</body>");
			out.println("</html>");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang=\"en\">");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
			out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			out.println("<title>Document</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("PLEASE INSERT AN INTEGER!");
			out.println("You've got an e.printStackTrace() ERROR!");
			out.println("<div><button onclick=\"window.location.href='index.html';\">Return to HomePage</button></div>");
			out.println("</body>");
			out.println("</html>");
		}
		
    }
}