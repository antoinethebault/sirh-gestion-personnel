	package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;

/**
 * @author antoinethebault
 *DepartementService : permet de sauvegarder un service ou
 *retourner la liste des services
 */
public class DepartementService {

	List<Departement> departements = new ArrayList<>();
	
	/**Constructor
	 * 
	 */
	public DepartementService () {
		/**Initialise la liste avec des valeurs*/
		Departement departement1 = new Departement("Comptabilité");
		Departement departement2 = new Departement("Ressources Humaines");
		Departement departement3 = new Departement("Informatique");
		Departement departement4 = new Departement("Administratif");
		Departement departement5 = new Departement("");
		sauvegarderDepartement(departement1);
		sauvegarderDepartement(departement2);
		sauvegarderDepartement(departement3);
		sauvegarderDepartement(departement4);
		sauvegarderDepartement(departement5);
	}
	
	/**
	 * sauvegarderDepartement
	 * @param departement
	 */
	public void sauvegarderDepartement(Departement departement) {
		departements.add(departement);
	}
	
	/**
	 * listerDepartement
	 * @return la liste des departements
	 */
	public List<Departement> listerDepartement(){
		return departements;
	}
	
	/**
	 * rechercherDepartement 
	 * @param nom
	 * @return le departement recherche ou un nouveau
	 */
	public Departement rechercherDepartement(String nom) {
		for (Departement departement : departements) {
			if (departement.getNom().equals(nom))
				return departement;
		}
		return new Departement(nom);
	}
	
}
