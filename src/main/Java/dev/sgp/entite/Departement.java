package dev.sgp.entite;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author antoinethebault
 *Departement
 */
public class Departement {
	
	private static final AtomicInteger count = new AtomicInteger(0);
	
	/**id : Integer*/
	private Integer id;
	
	/**nom : String*/
	private String nom;

	/**Constructor
	 * @param id
	 * @param nom
	 */
	public Departement(String nom) {
		super();
		this.id = count.incrementAndGet();
		this.nom = nom;
	}

	/**Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
