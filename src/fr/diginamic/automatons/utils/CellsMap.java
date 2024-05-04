package fr.diginamic.automatons.utils;

import java.util.Arrays;

import fr.diginamic.automatons.entities.Cell;

public abstract class CellsMap {
  private static Cell[][] map;

  public static Cell[][] getMap() {
    return map;
  }

  public static void build(int lines, int columns) {
    map = new Cell[lines][columns];

    for (int i = 0; i < lines; i++) {
      for (int j = 0; j < columns; j++) {
        Cell cell = new Cell(CellState.random());
        map[i][j] = cell;
      }
    }
  }

  public static void display() {
    StringBuilder sb = new StringBuilder("\n");

    for (Cell[] cells : map) {
      Arrays.stream(cells).forEach(cell -> {
        sb.append("| " + cell + " ");
      });
      sb.append("|\n");
    }

    System.out.println(sb.toString());
  }
}
