package fr.diginamic.automatons.utils;

import fr.diginamic.automatons.entities.Cell;

public abstract class CellsMap {
  private static Cell[][] map;
  private static final long SPEED_ANIM = 100;

  public static Cell[][] getMap() {
    return map;
  }

  public static void build(int lines, int columns) {
    if (null == map) {
      map = new Cell[lines][columns];
    }

    for (int i = 0; i < lines; i++) {
      for (int j = 0; j < columns; j++) {
        if (null == map[i][j])
          map[i][j] = new Cell(CellStateEnum.random(), i, j);
        else
          map[i][j] = new Cell(map[i][j].getNewState(), i, j);
      }
    }
  }

  public static boolean areAllCellsDead() {
    if (null == map) {
      return false;
    }

    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j].getState() != CellStateEnum.DEAD) {
          return false;
        }
      }
    }

    return true;
  }

  public static void displayAndPrepareNextState() {
    StringBuilder sb = new StringBuilder("\n");

    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        Cell current = map[i][j];
        sb.append(current);

        int countAlive = countAliveAround(current);
        if (countAlive == 3)
          current.setNextState(CellStateEnum.ALIVE);
        else if (countAlive < 2 || countAlive > 3)
          current.setNextState(CellStateEnum.DEAD);
        else
          current.setNextState(current.getState());
      }
      ;
      sb.append("\n");
    }

    ClearConsole.clear(SPEED_ANIM);
    System.out.println(sb.toString());
  }

  private static int countAliveAround(Cell cell) {
    int cellI = cell.getPosition()[0];
    int cellJ = cell.getPosition()[1];
    int countAlive = 0;

    for (int i = cellI - 1; i <= cellI + 1; i++) {
      for (int j = cellJ - 1; j <= cellJ + 1; j++) {
        boolean isCurrent = (i == cellI && j == cellJ);
        boolean colOverflow = (i < 0 || i >= map.length);
        boolean rowOverflow = (j < 0 || (!colOverflow && j >= map[i].length));

        if (!isCurrent && !colOverflow && !rowOverflow) {
          if (map[i][j].getState() == CellStateEnum.ALIVE) {
            countAlive++;
          }
        }
      }
    }

    return countAlive;
  }
}
