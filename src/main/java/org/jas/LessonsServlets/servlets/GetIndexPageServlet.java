package org.jas.LessonsServlets.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetIndexPageServlet
 */
public class GetIndexPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GetIndexPageServlet() {
        // TODO Auto-generated constructor stub
    }
    
    private static String index = "/WEB-INF/view/index.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher(index).forward(request, response);
	}


}
