package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String var1 = req.getParameter("var1");
		double a = Double.valueOf(var1);            
		String var2 = req.getParameter("var2");
		double b = Double.valueOf(var2);            
		String var3 = req.getParameter("var3");
		double c = Double.valueOf(var3);
		double x1, x2;
		
		double d = (b*b-4*a*c);	
		if (d < 0) 
			resp.getWriter().println("no solutions");
		else if (d == 0) {
		x1 = -b/(2*a);
		resp.getWriter().println(x1);
		}
		else {
			x1 = (-b + Math.sqrt(d))/(2*a);
			x2 = (-b - Math.sqrt(d))/(2*a);
			
		resp.getWriter().println(x1);
		resp.getWriter().println(x2);
		}
	}

}
