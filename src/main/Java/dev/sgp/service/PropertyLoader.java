package dev.sgp.service;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class PropertyLoader{

   /**
    * Charge la liste des propriétés contenu dans le fichier spécifié
    *
    * @param filename le fichier contenant les propriétés
    * @return un objet Properties contenant les propriétés du fichier
    */
   public static Properties load(String filename) throws IOException, FileNotFoundException{
      Properties properties = new Properties();
      InputStream input = PropertyLoader.class.getClassLoader().getResourceAsStream("application.properties");
      if (input == null)
    	  System.out.println("Properties is null");
      try{
         properties.load(input);
         return properties;
      }
      finally{
    	  input.close();
      }
   }
}



