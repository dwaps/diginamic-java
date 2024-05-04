package fr.diginamic.automatons;

import java.util.Properties;

import fr.diginamic.automatons.utils.CellsMap;
import fr.diginamic.automatons.utils.Configuration;

import static fr.diginamic.automatons.utils.Constants.*;

public class GameOfLife {
  public static void main(String[] args) {
    Configuration.loadConfig(args);

    Properties properties = Configuration.getProperties();
    int gridSize = Integer.parseInt(properties.getProperty(PROPERTY_KEY_GRID_SIZE));

    CellsMap.build(gridSize, gridSize);
    CellsMap.display();
  }
}
