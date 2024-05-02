package fr.diginamic.jdr.utils;

import java.util.Random;

public class RandomValue {
  public static int getInt(int min, int max) {
    return new Random().nextInt((max - min) + 1) + min;
  }

  public static int getStrenght(CharacterEnum ce) {
    switch (ce) {
      case PLAYER:
        return RandomValue.getInt(Constants.PLAYER_STRENGHT_MIN, Constants.PLAYER_STRENGHT_MAX);
      case WOLF:
        return RandomValue.getInt(Constants.WOLF_STRENGHT_MIN, Constants.WOLF_STRENGHT_MAX);
      case GOBLIN:
        return RandomValue.getInt(Constants.GOBLIN_STRENGHT_MIN, Constants.GOBLIN_STRENGHT_MAX);
      case TROLL:
        return RandomValue.getInt(Constants.TROLL_STRENGHT_MIN, Constants.TROLL_STRENGHT_MAX);
      default:
        return 0;
    }
  }

  public static int getLifePoints(CharacterEnum ce) {
    switch (ce) {
      case PLAYER:
        return RandomValue.getInt(Constants.PLAYER_LIFE_POINTS_MIN, Constants.PLAYER_LIFE_POINTS_MAX);
      case WOLF:
        return RandomValue.getInt(Constants.WOLF_LIFE_POINTS_MIN, Constants.WOLF_LIFE_POINTS_MAX);
      case GOBLIN:
        return RandomValue.getInt(Constants.GOBLIN_LIFE_POINTS_MIN, Constants.GOBLIN_LIFE_POINTS_MAX);
      case TROLL:
        return RandomValue.getInt(Constants.TROLL_LIFE_POINTS_MIN, Constants.TROLL_LIFE_POINTS_MAX);
      default:
        return 0;
    }
  }
}
