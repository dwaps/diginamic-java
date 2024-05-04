package fr.diginamic.automatons.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class Configuration {

  private static Properties properties = new Properties();

  public static Properties getProperties() {
    return properties;
  }

  public static void loadConfig(String... args) {
    String sufixe = "";
    String info = "PAR DEFAUT"; // info: type of game

    if (args.length > 0) {
      String arg = args[0].trim().toLowerCase();
      if (arg.equals("o")) {
        sufixe = "-oscillator";
        info = "OSCILLATEURS";
      }
      if (arg.equals("s")) {
        sufixe = "-spaceship";
        info = "VAISSEAUX";
      }
    }

    File file = new File(String.format("src/config/gof%s.properties", sufixe));
    String filepath = file.getAbsolutePath();

    System.out.println("\nCHARGEMENT DE LA CONFIGURATION " + info);
    System.out.println("(Fichier: " + file.getName() + ")\n");

    try (FileInputStream fi = new FileInputStream(filepath)) {
      properties.load(fi);
      System.out.println(properties.getProperty("TYPE"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
