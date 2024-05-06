package fr.diginamic.recensement.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
  public static final String FILE_CSV_PATH = "src/main/resources/recensement.csv";
  public static final String MENU = """

      -- MENU --

      1. Population d'une ville donnée
      2. Population d'un département donné
      3. Population d'une région donnée
      4. Afficher les 10 régions les plus peuplées
      5. Afficher les 10 départements les plus peuplés
      6. Afficher les 10 villes les plus peuplées d'un département
      7. Afficher les 10 villes les plus peuplées d'une région
      8. Afficher les 10 villes les plus peuplées de France
      9. Sortir

      Choisissez une option:\s""";

  public static final Map<Integer, String> QUESTIONS_SUP = new HashMap<>();

  static {
    QUESTIONS_SUP.put(1, "\nNom de la ville concernée: ");
    QUESTIONS_SUP.put(2, "\nCode du département concerné (sur 2 chiffres): ");
    QUESTIONS_SUP.put(3, "\nNom de la région concernée: ");
    QUESTIONS_SUP.put(6, QUESTIONS_SUP.get(2));
    QUESTIONS_SUP.put(7, QUESTIONS_SUP.get(3));
  }
}