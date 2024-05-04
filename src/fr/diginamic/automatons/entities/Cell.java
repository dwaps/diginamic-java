package fr.diginamic.automatons.entities;

import fr.diginamic.automatons.utils.CellState;

public record Cell(CellState state, int x, int y) {

  public int[] getPosition() {
    return new int[] { x, y };
  }

  @Override
  public String toString() {
    return state == CellState.ALIVE ? "X" : " ";
  }
}
