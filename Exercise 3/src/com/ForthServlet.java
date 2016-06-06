package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ForthServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		int[][] a=new int[5][8];
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
		
		int max = a[0][0];
		for (int i=0;i < a.length;i++){
		    for (int j=0;j < a[i].length;j++){
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
		resp.getWriter().println("<html><body><br></body></html>");
		resp.getWriter().println("Max number of the array is ");
		resp.getWriter().println(max);
		
	}
}
