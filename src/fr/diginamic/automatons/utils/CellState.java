package fr.diginamic.automatons.utils;

import java.util.Random;

public enum CellState {
  ALIVE,
  DEAD;

  public static CellState random() {
    int index = new Random().nextInt(CellState.values().length);
    return CellState.values()[index];
  }
}
