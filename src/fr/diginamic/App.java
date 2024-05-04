package fr.diginamic;

import static fr.diginamic.automatons.utils.Constants.PROPERTY_KEY_GRID_SIZE;

import java.util.Properties;

import fr.diginamic.automatons.GameOfLife;
import fr.diginamic.automatons.utils.Configuration;

public class App {
  public static void main(String[] args) {
    Configuration.loadConfig(args);
    Properties properties = Configuration.getProperties();
    int gridSize = Integer.parseInt(properties.getProperty(PROPERTY_KEY_GRID_SIZE));

    new GameOfLife().run(gridSize);
  }
}
