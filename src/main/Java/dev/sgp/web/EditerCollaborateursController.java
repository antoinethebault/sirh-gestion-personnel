package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet {
	private static final long serialVersionUID = -2796943719061702802L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String matricule = req.getParameter("matricule");
		
		resp.setContentType("text/html");
		
		if (matricule==null) {
			//on renvoie une erreur 400
			resp.setStatus(400);
			
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("Un matricule est attendu");
		}
		else {
			//on renvoie une erreur 200
			resp.setStatus(200);
			
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<html><body>");
			resp.getWriter().write("<h1>Edition de collaborateur</h1>");
			resp.getWriter().write("Matricule : "+matricule);
			resp.getWriter().write("</body></html>");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		//on fait une liste pour les erreurs remontees pour les
		//parametres manquants
		List<String> erreurs = new ArrayList<>();
		
		if (matricule==null) 
			erreurs.add("matricule");
		if (titre==null)
			erreurs.add("titre");
		if (nom==null)
			erreurs.add("nom");
		if (prenom==null)
			erreurs.add("prenom");
		
		if(erreurs.isEmpty()) {//si on a pas d'erreur
			resp.setStatus(201);
			resp.getWriter().write("<html><body>");
			resp.getWriter().write("Creation d’un collaborateur avec les informations suivantes :");
			resp.getWriter().write("matricule="+matricule+", titre="+titre+", nom="+nom+", prenom="+prenom);
			resp.getWriter().write("</body></html>");
		}
		else {//si on a une erreur
			resp.setStatus(400);
			resp.getWriter().write("Les paramètres suivants sont incorrects :");
			for (String chaine : erreurs) 
				resp.getWriter().write(chaine+" ");
		}
		
	}
}
