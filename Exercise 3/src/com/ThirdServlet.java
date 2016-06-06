package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ThirdServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		int[][] a=new int[8][5];
		  for (int i=0;i < a.length;i++){
		    for (int j=0;j < a[i].length;j++){
		      a[i][j]=(int)((Math.random()*90)+10);
		      }
		     }
		for (int i=0;i < a.length;i++) {
			
		for (int j=0;j < a[i].length;j++){
			resp.getWriter().println(a[i][j]+" ");
		}
		resp.getWriter().println("<html><body><br></body></html>");
		}
	
		
	}
}
