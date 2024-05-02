package fr.diginamic.jdr.utils;

import java.util.Random;

public enum CharacterEnum {
  PLAYER,
  WOLF,
  GOBLIN,
  TROLL;

  public static CharacterEnum getRandom() {
    CharacterEnum[] values = CharacterEnum.values();
    Random random = new Random();
    CharacterEnum characterEnum;

    do {
      characterEnum = values[random.nextInt(values.length)];
    } while (characterEnum == PLAYER);

    return characterEnum;
  }
}
