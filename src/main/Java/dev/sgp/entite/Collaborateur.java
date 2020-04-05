package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * @author antoinethebault
 *
 */
public class Collaborateur {
	/**String matricule */
	private String matricule;
	/**String nom */
	private String nom;
	/**String prenom */
	private String prenom;
	/**LocalDate dateNaissance */
	private LocalDate dateNaissance;
	/**String adresse */
	private String adresse;
	/**String numeroSecuriteSociale */
	private String numeroSecuriteSociale;
	/**String emailPro */
	private String emailPro;
	/**String photo */
	private String photo;
	/**ZonedDateTime dateHeureCreation */
	private ZonedDateTime dateHeureCreation;
	/**boolean actif */
	private boolean actif;
	/**intitulePoste : String*/
	private String intitulePoste;
	/**departement : Departement*/
	private Departement departement;
	
	/**
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param adresse
	 * @param numeroSecuriteSociale
	 * @param emailPro
	 * @param photo
	 * @param dateHeureCreation
	 * @param actif
	 */
		public Collaborateur(String matricule, String nom, String prenom, LocalDate dateNaissance, String adresse,
				String numeroSecuriteSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation,
				boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numeroSecuriteSociale = numeroSecuriteSociale;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule : the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom : the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom : the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance : the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse : the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the numeroSecuriteSociale
	 */
	public String getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}

	/**
	 * @param numeroSecuriteSociale : the numeroSecuriteSociale to set
	 */
	public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}

	/**
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}

	/**
	 * @param emailPro : the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo : the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	/**
	 * @param dateHeureCreation : the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	/**
	 * @return the actif
	 */
	public boolean isActif() {
		return actif;
	}

	/**
	 * @param actif : the actif to set
	 */
	public void setActif(boolean actif) {
		this.actif = actif;
	}

	/**Getter
	 * @return the intitulePoste
	 */
	public String getIntitulePoste() {
		return intitulePoste;
	}

	/**Setter
	 * @param intitulePoste the intitulePoste to set
	 */
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	/**Getter
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}

	/**Setter
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
}
