package fr.diginamic.essais;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AffichageForme {
  public static void main(String[] args) {
    String filepath = System.getProperty("user.dir") + File.separator + "coco.txt";

    System.out.println(filepath);

    try (FileWriter fw = new FileWriter(filepath)) {
      fw.write("ça va ?");
      System.out.println("Fichier créé avec succès à l'emplacement : " +
          filepath);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
