package fr.diginamic.jdr.utils;

import static fr.diginamic.jdr.utils.Constants.*;

public class Range {
  public int strenghtMin;
  public int strenghtMax;
  public int lifePointsMin;
  public int lifePointsMax;

  private Range(int strenghtMin, int strenghtMax, int lifePointsMin, int lifePointsMax) {
    this.strenghtMin = strenghtMin;
    this.strenghtMax = strenghtMax;
    this.lifePointsMin = lifePointsMin;
    this.lifePointsMax = lifePointsMax;
  }

  public static Range getPlayerRange() {
    return new Range(
        PLAYER_STRENGHT_MIN,
        PLAYER_STRENGHT_MAX,
        PLAYER_LIFE_POINTS_MIN,
        PLAYER_LIFE_POINTS_MAX);
  }

  public static Range getWolfRange() {
    return new Range(
        WOLF_STRENGHT_MIN,
        WOLF_STRENGHT_MAX,
        WOLF_LIFE_POINTS_MIN,
        WOLF_LIFE_POINTS_MAX);
  }

  public static Range getGoblinRange() {
    return new Range(
        GOBLIN_STRENGHT_MIN,
        GOBLIN_STRENGHT_MAX,
        GOBLIN_LIFE_POINTS_MIN,
        GOBLIN_LIFE_POINTS_MAX);
  }

  public static Range getTrollRange() {
    return new Range(
        TROLL_STRENGHT_MIN,
        TROLL_STRENGHT_MAX,
        TROLL_LIFE_POINTS_MIN,
        TROLL_LIFE_POINTS_MAX);
  }
}
