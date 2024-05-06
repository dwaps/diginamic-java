package fr.diginamic.automatons;

import fr.diginamic.automatons.utils.CellsMap;

public class GameOfLife {

  public void run(int gridSize) {
    System.out.println("Starting...");

    while (!CellsMap.areAllCellsDead()) {
      CellsMap.build(gridSize, gridSize);
      CellsMap.displayAndPrepareNextState();
    }

    System.out.println("\nGame of life ends: all cells are dead\n");
  }
}
