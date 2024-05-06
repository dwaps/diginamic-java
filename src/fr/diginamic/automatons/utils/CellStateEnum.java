package fr.diginamic.automatons.utils;

import java.util.Random;

public enum CellStateEnum {
  ALIVE,
  DEAD;

  public static CellStateEnum random() {
    int index = new Random().nextInt(CellStateEnum.values().length);
    return CellStateEnum.values()[index];
  }
}
