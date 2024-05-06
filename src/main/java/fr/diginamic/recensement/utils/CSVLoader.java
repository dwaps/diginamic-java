package fr.diginamic.recensement.utils;

import static fr.diginamic.recensement.utils.Constants.FILE_CSV_PATH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import fr.diginamic.recensement.entities.Place;
import fr.diginamic.recensement.entities.Places;

public abstract class CSVLoader {
  private static final String SEP = ";";

  public static void load() {
    try (BufferedReader br = new BufferedReader(new FileReader(FILE_CSV_PATH))) {
      String line;

      // skip first line
      br.readLine();

      while (null != (line = br.readLine())) {
        Places.add(new Place(line.split(SEP)));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}