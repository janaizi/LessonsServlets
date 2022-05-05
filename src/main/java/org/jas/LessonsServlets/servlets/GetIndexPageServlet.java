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
    
    @Override
    public void init() throws ServletException {
        System.out.println("*************SERVLET IS INIT************");
        System.out.println("FOR PATH '/' WILL RENDER VIEW : " + index);
    }
    
    //Multithreading scope.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet is work!");
		request.getRequestDispatcher(index).forward(request, response);
	}
	
	@Override
    public void destroy() {
        System.out.println("*************SERVLET IS DESTROY************");
    }

}
