package dev.sgp.service;

import java.net.URL;

/**
 * @author antoinethebault
 *PhotoLoader : renvoie l'url d'une photo
 */
public class PhotoLoader {
	public String loadPhoto(String photo) {
		URL url = PhotoLoader.class.getClassLoader().getResource(photo);
		return url.toString();
	}
}
