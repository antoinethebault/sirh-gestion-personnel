package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {

	private static final long serialVersionUID = 3155850309813211995L;

	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// utilisation du service
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		
		req.setAttribute("collaborateurs", collaborateurs); 
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		
		//on verifie si des elements de recherche sont renseignes
		String debut = req.getParameter("recherche");
		if (debut != null) {
			debut = debut.toLowerCase();
			collaborateurs = collabService.getCollaborateursDebut(debut);
		}
		
		String desactive = req.getParameter("desactive");
		if(desactive != null) {
			collaborateurs = collabService.listerCollaborateursAll();
			req.setAttribute("desactiveactif", true);
		}
		
		String departement = req.getParameter("departement");
		if (departement != null && !departement.equals("")) {
			collaborateurs = collabService.listerCollaborateursDepartmt(departement);
			req.setAttribute("filtrer", departement);
		}
		
		//on fait le dispatch
		req.setAttribute("collaborateurs", collaborateurs); 
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);
	}
}
