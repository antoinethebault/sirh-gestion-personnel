package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.PropertyLoader;
import dev.sgp.util.Constantes;

/**
 * @author antoinethebault
 * recoit les donnees du formulaire de creation d'un collaborateur
 * traite les donnees
 * redirige vers la liste des collaborateurs
 */
public class CreationCollaborateurController extends HttpServlet{
	
	/**CollaborateurService collabService : recuperation du service */
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	/**long serialVersionUID */
	private static final long serialVersionUID = -3613305123429338889L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//liste des erreurs
		ArrayList<String> erreurs = new ArrayList<>();
		
		// chargement des propriétés
        Properties prop = PropertyLoader.load("application.properties");
		
		//on recupere les infos du formulaire 
		//et on cree les infos manquantes
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();
		
		String prenom = req.getParameter("prenom");
		String nom = req.getParameter("nom");
		String emailPro = prenom+"."+nom+"@"+prop.getProperty("emailsociete");
		
		//on verifie la date de naissance et on la configure en date
		LocalDate dateNaissance = null;
		String chaine = req.getParameter("dateNaissance");
		String regex = "^[0-3]?[0-9]/[0-3]?[0-9]/[0-9]{4}$";
		if(Pattern.matches(regex,chaine)) {
			String[] tableau = chaine.split("/");
			dateNaissance = LocalDate.of(Integer.valueOf(tableau[2]), Integer.valueOf(tableau[1]), Integer.valueOf(tableau[0]));
			
		}else {
			erreurs.add(" la date de naissance doit etre au format JJ/MM/AAAA ");
		}
		
		String adresse = req.getParameter("adresse");
		
		//on verifie le numero de secutite sociale
		String numeroSecuriteSociale = req.getParameter("numeroSecuriteSociale");
		if (numeroSecuriteSociale.length() != 15) {
			erreurs.add(" le numero de securite sociale doit contenir 15 chiffres ");
		}
		
		if(erreurs.isEmpty()) {
			//on enregistre le collaborateur
			Collaborateur collaborateur = new Collaborateur (nom, prenom, dateNaissance, adresse,
					numeroSecuriteSociale, emailPro, "photo.png", dateHeureCreation, true);
			collabService.sauvegarderCollaborateur(collaborateur);
			
			//recupere la liste des collaborateurs
			List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
			
			req.setAttribute("collaborateurs", collaborateurs); 
			req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
			.forward(req, resp);
		}
		else {//si il y a des erreurs
			resp.setStatus(400);
			resp.getWriter().write("des erreurs ont ete rencontrees : ");
			for (String erreur : erreurs)
				resp.getWriter().write(erreur);
		}
	}
}
