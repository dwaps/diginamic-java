package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entities.Salarie;

public class ManipulationChaine {
  public static void main(String[] args) {
    String chaine = "Durand;Marcel;2 523.5";
    char premierCaractere = chaine.charAt(0);
    System.out.println("\n\nPremier caractère: " + premierCaractere);

    System.out.println("Longueur --> " + chaine.length());
    System.out.println("Index du 1er ; --> " + chaine.indexOf(';'));

    String familyName = chaine.substring(0, chaine.indexOf(';'));
    System.out.println("Nom de famille --> " + familyName);
    System.out.println("Nomde famille (maj) : " + familyName.toUpperCase());
    System.out.println("Nomde famille (min) : " + familyName.toLowerCase());

    System.out.println("--------------");
    String[] infoSalarie = chaine.split(";");
    System.out.println("split usage --> " + Arrays.toString(infoSalarie));

    try {
      Salarie salarie = new Salarie(infoSalarie[0], infoSalarie[1],
          Double.parseDouble(infoSalarie[2].replace(" ", "")));
      System.out.println(salarie);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}