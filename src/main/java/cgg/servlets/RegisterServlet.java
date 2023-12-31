package cgg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Welcome to register servlet</h2>");
		
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");
		
		if(cond!=null ) {
			out.println("<h2>Name:  "+name+"</h2>");
			out.println("<h2>Password:  "+password+"</h2>");
			out.println("<h2>Email:  "+email+"</h2>");
			out.println("<h2>Gender:  "+gender+"</h2>");
			out.println("<h2>Course:  "+course+"</h2>");
			
			
			//
			//jdbc
			//
			RequestDispatcher rd = req.getRequestDispatcher("SuccessServlet");
			rd.forward(req, resp);
		}
		
		else {
			out.println("You have not accepted terms and conditions");
			
			//include the output of index.html(form)
			//Hence get the object of requestDispatcher
			
			RequestDispatcher rs = req.getRequestDispatcher("index.html");
			rs.include(req, resp);
			
		}
	}
}
