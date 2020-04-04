package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreerCollaborateurController extends HttpServlet {
	
	/**long serialVersionUID */
	private static final long serialVersionUID = 6846549858526037390L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp")
		.forward(req, resp);
	}

}
