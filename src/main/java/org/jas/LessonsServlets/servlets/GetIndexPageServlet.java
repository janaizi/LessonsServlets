package org.jas.LessonsServlets.servlets;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jas.LessonsServlets.model.User;

/**
 * Servlet implementation class GetIndexPageServlet
 */
public class GetIndexPageServlet extends HttpServlet {
	private final static String index = "/WEB-INF/view/index.jsp";

	public GetIndexPageServlet() {
		// TODO Auto-generated constructor stub
	}

	private List<User> users;

	@Override
	public void init() throws ServletException {
		System.out.println("*************SERVLET IS INIT************");
		System.out.println("FOR PATH '/' WILL RENDER VIEW : " + index);
		users = new CopyOnWriteArrayList<User>();
		users.add(new User("Janysh", 26));
		users.add(new User("Baiysh", 26));
	}

	// Multithreading scope.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet is work!");
		request.setAttribute("users", users);
		request.getRequestDispatcher(index).forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost is work!");
		
		req.setCharacterEncoding("UTF8");
		
		if (!requestIsValid(req)) {
			doGet(req, resp);
		}

		final String name = req.getParameter("name");
		final String age = req.getParameter("age");

		final User user = new User(name, Integer.valueOf(age));

		users.add(user);

		doGet(req, resp);
	}

	private boolean requestIsValid(final HttpServletRequest req) {

		final String name = req.getParameter("name");
		final String age = req.getParameter("age");

		return name != null && name.length() > 0 && age != null && age.length() > 0 && age.matches("[+]?\\d+");
	}

	@Override
	public void destroy() {
		System.out.println("*************SERVLET IS DESTROY************");
	}

}
