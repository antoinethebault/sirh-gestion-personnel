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
		Departement departement1 = new Departement("Comptabilite");
		Departement departement2 = new Departement("Ressources Humaines");
		Departement departement3 = new Departement("Informatique");
		Departement departement4 = new Departement("Administratif");
		sauvegarderDepartement(departement1);
		sauvegarderDepartement(departement2);
		sauvegarderDepartement(departement3);
		sauvegarderDepartement(departement4);
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
	
}
