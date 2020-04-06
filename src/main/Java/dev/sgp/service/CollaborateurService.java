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
		Collaborateur collaborateur1 = new Collaborateur("Duchene", "Andre", LocalDate.of(1980, 1, 1), "1, rue des lilas, 35000 Rennes",
				"123456789012345", "andre.duchene@societe.com", "photo.png", ZonedDateTime.now(), true);
		Collaborateur collaborateur2 = new Collaborateur("Duchene", "Albert", LocalDate.of(1980, 2, 2), "1, rue des lilas, 35000 Rennes",
				"123456789012345", "albert.duchene@societe.com", "photo.png", ZonedDateTime.now(), true);
		Collaborateur collaborateur3 = new Collaborateur("Dutrain", "Rene", LocalDate.of(1980, 3, 3), "1, rue des lilas, 35000 Rennes",
				"123456789012345", "rene.dutrain@societe.com", "photo.png", ZonedDateTime.now(), true);
		collaborateur1.setDepartement(DepartementService.rechercherDepartement("Informatique"));
		collaborateur2.setDepartement(DepartementService.rechercherDepartement("Administratif"));
		collaborateur3.setDepartement(DepartementService.rechercherDepartement("Administratif"));
		sauvegarderCollaborateur(collaborateur1);
		sauvegarderCollaborateur(collaborateur2);
		sauvegarderCollaborateur(collaborateur3);
	}
	
	/**
	 * listerCollaborateurs
	 * @return la liste des collaborateurs actifs
	 */
	public List<Collaborateur> listerCollaborateurs() {
		List<Collaborateur> collaborateurs = new ArrayList<>();
		for (Collaborateur collaborateur : listeCollaborateurs) {
			if (collaborateur.isActif())
				collaborateurs.add(collaborateur);
		}
		return collaborateurs;
	}
	
	/**
	 * listerCollaborateurs
	 * @return la liste des collaborateurs actifs et non actifs
	 */
	public List<Collaborateur> listerCollaborateursAll() {
		return listeCollaborateurs;
	}
	
	/**
	 * listerCollaborateursDepartmt
	 * @return la liste des collaborateurs correspondant au departement 
	 * passe en parametre
	 */
	public List<Collaborateur> listerCollaborateursDepartmt(String departement) {
		List<Collaborateur> collaborateurs = new ArrayList<>();
		for (Collaborateur collaborateur : listeCollaborateurs) {
			if (collaborateur.getDepartement().getNom().toLowerCase().replaceAll("é", "e").equals(departement))
				collaborateurs.add(collaborateur);
		}
		return collaborateurs;
	}

	/**
	 * sauvegarderCollaborateur
	 * @param collab : le collaborateur a sauvegarder
	 */
	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
	
	public Collaborateur getCollaborateur (String matricule) {
		for (Collaborateur collaborateur : listeCollaborateurs) {
			if (collaborateur.getMatricule().equals(matricule))
				return collaborateur;
		}
		return null;
	}
	
	public List<Collaborateur> getCollaborateursDebut (String debut){
		List<Collaborateur> collaborateurs = new ArrayList<>();
		for (Collaborateur collaborateur : listeCollaborateurs) {
			if (collaborateur.getNom().toLowerCase().startsWith(debut) || collaborateur.getPrenom().toLowerCase().startsWith(debut))
				collaborateurs.add(collaborateur);
		}
		return collaborateurs;
	}
}
