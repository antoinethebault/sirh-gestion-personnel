package dev.sgp.util;

import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;

/**
 * @author antoinethebault
 *Constantes : les constantes de l'application
 */
public interface Constantes { 
	/**Permet de lister les collaborateurs de l'application*/
	CollaborateurService COLLAB_SERVICE = new CollaborateurService();
	
	/**Permet de lister les departements de l'application*/
	DepartementService DEPARTMT_SERVICE = new DepartementService();
}
