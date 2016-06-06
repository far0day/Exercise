package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String var1 = req.getParameter("var1");
		double m = Double.valueOf(var1);            
		String var2 = req.getParameter("var2");
		double n = Double.valueOf(var2);             
		Object result; 
		
		double dis1 = Math.abs(10-m);
		double dis2 = Math.abs(10-n);
		
		if (dis1 > dis2) {
			result = n;
		}
		else if (dis1 == dis2){
			result = null;
		}
		else result = m;
		
		if (result == null){	       
		resp.getWriter().println("The numbers are equals or equidistant");
		}
		else {
			resp.getWriter().println(result);
		}
	}

}
