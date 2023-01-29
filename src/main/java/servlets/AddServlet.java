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
			out.println("<title>Results</title>");
			out.println("<link rel=\"stylesheet\" href=\"style.css\">");
			out.println("</head>");
			out.println("<body>");
			out.println("<div class=\"center-div\">Result of " + i + " + " + j + " = " + k + "</div");
			out.println("<div class=\"center-div\"><button class=\"center-btn\" onclick=\"window.location.href='index.html';\">Return to HomePage</button></div>");
			out.println("<script src=\"https://code.jquery.com/jquery-3.6.3.slim.js\" integrity=\"sha256-DKU1CmJ8kBuEwumaLuh9Tl/6ZB6jzGOBV/5YpNE2BWc=\" crossorigin=\"anonymous\"></script>");
			out.println("<script src=\"script.js\"></script>");
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
			out.println("<title>Error!</title>");
			out.println("<link rel=\"stylesheet\" href=\"style.css\">");
			out.println("</head>");
			out.println("<body>");
			out.println("<div class=\"center-div\"><h2>PLEASE INSERT AN INTEGER!</div><h2>");
			out.println("<div class=\"center-div\"><h4>You've got an e.printStackTrace() ERROR!</div><h2>");
			out.println("<div class=\"center-div\"><button  class=\"center-btn\" onclick=\"window.location.href='index.html';\">Return to HomePage</button></div>");
			out.println("<script src=\"https://code.jquery.com/jquery-3.6.3.slim.js\" integrity=\"sha256-DKU1CmJ8kBuEwumaLuh9Tl/6ZB6jzGOBV/5YpNE2BWc=\" crossorigin=\"anonymous\"></script>");
			out.println("<script src=\"script.js\"></script>");
			out.println("<script $( document ).ready(function() {\r\n"
					+ "    console.log(\"Script under WEB-INF loaded!\");\r\n"
					+ "    // alert(\"Alert under WEB-INF loaded!\");\r\n"
					+ "});></script>");
			out.println("</body>");
			out.println("</html>");
		}
		
    }
}