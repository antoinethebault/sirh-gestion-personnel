package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

/**
 * CollaborateurService permet de lister les differents collaborateurs
 * de l'application
 */
public class CollaborateurService {
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
}
