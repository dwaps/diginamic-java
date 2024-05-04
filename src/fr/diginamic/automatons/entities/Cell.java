package fr.diginamic.automatons.entities;

import fr.diginamic.automatons.utils.CellState;

public record Cell(CellState state) {
  @Override
  public String toString() {
    return state == CellState.ALIVE ? "X" : " ";
  }
}
