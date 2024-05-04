package fr.diginamic.automatons;

import java.util.Arrays;

import fr.diginamic.automatons.entities.Cell;
import fr.diginamic.automatons.utils.CellState;
import fr.diginamic.automatons.utils.CellsMap;

public class GameOfLife {

  public void run(int gridSize) {
    while (true) {
      CellsMap.build(gridSize, gridSize);
      CellsMap.display();
      checkCellsAround();
      // TMP
      break;
    }
  }

  private void checkCellsAround() {
    Cell[][] map = CellsMap.getMap();

    for (Cell[] cells : map) {
      for (Cell current : cells) {
        int[] countDeadAlive = countCellsAround(current);
        System.out.print("Etat: " + Arrays.toString(countDeadAlive) + "    ");
      }
      System.out.println();
    }
  }

  private int[] countCellsAround(Cell cell) {
    Cell[][] map = CellsMap.getMap();
    int x = cell.x();
    int y = cell.y();
    int countAlive = 0;
    int countDead = 0;

    for (int i = y - 1; i <= y + 1; i++) {
      for (int j = x - 1; j <= x + 1; j++) {
        boolean isCurrent = (i == y && j == x);
        boolean colOverflow = (i < 0 || i >= map.length);
        boolean rowOverflow = (j < 0 || (!colOverflow && j >= map[i].length));

        if (!colOverflow && !rowOverflow && !isCurrent) {
          if (map[i][j].state() == CellState.ALIVE) {
            countAlive++;
          } else {
            countDead++;
          }
        }
      }
    }

    return new int[] { countAlive, countDead };
  }
}
