package dev.sgp.service;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

/**
 * CollaborateurService permet de lister les differents collaborateurs
 * de l'application
 */
public class CollaborateurService {
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	/**
	 * Constructor
	 */
	public CollaborateurService() {
		//creation de collaborateurs pour le test
		Collaborateur collaborateur1 = new Collaborateur("M01", "Duchene", "Andre", LocalDate.of(1980, 1, 1), "1, rue des lilas, 35000 Rennes",
				"123456789012345", "andre.duchene@societe.com", "photo.png", ZonedDateTime.now(), true);
		Collaborateur collaborateur2 = new Collaborateur("M02", "Duchene", "Albert", LocalDate.of(1980, 2, 2), "1, rue des lilas, 35000 Rennes",
				"123456789012345", "albert.duchene@societe.com", "photo.png", ZonedDateTime.now(), true);
		Collaborateur collaborateur3 = new Collaborateur("M03", "Dutrain", "Rene", LocalDate.of(1980, 3, 3), "1, rue des lilas, 35000 Rennes",
				"123456789012345", "rene.dutrain@societe.com", "photo.png", ZonedDateTime.now(), true);
		sauvegarderCollaborateur(collaborateur1);
		sauvegarderCollaborateur(collaborateur2);
		sauvegarderCollaborateur(collaborateur3);
	}
	
	/**
	 * listerCollaborateurs
	 * @return la liste des collaborateurs
	 */
	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}

	/**
	 * sauvegarderCollaborateur
	 * @param collab : le collaborateur a sauvegarder
	 */
	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
}
