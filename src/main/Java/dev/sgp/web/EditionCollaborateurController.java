package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

public class EditionCollaborateurController extends HttpServlet{

	/**serialVersionUID : long*/
	private static final long serialVersionUID = -152583028834697677L;
	
	/**recuperation des services */
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	private DepartementService departmtService = Constantes.DEPARTMT_SERVICE;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//on recupere les infos d'edition et on
		//les insere dans le collaborateur approprie
		Collaborateur collaborateur = collabService.getCollaborateur(req.getParameter("matricule"));
		
		String desactive =  req.getParameter("desactive");
		if (desactive==null)
			collaborateur.setActif(true);
		else
			collaborateur.setActif(false);
		
		String adresse = req.getParameter("adresse");
		collaborateur.setAdresse(adresse);
		
		String intitulePoste = req.getParameter("intituleposte");
		collaborateur.setIntitulePoste(intitulePoste);
		
		String departement = req.getParameter("departement");
		collaborateur.setDepartement(departmtService.rechercherDepartement(departement));
		
		String banque = req.getParameter("banque");
		collaborateur.setBanque(banque);
		
		String bic = req.getParameter("bic");
		collaborateur.setBic(bic);
		
		String iban = req.getParameter("iban");
		collaborateur.setIban(iban);
		
		//recupere la liste des collaborateurs
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		
		//dispatch vers la liste des collaborateurs
		req.setAttribute("collaborateurs", collaborateurs); 
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);
	}
}
