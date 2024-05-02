package fr.diginamic.jdr;

public class Creature extends Character {
  public Creature(int strength, int lifePoints) {
    super(strength, lifePoints);
  }

  public void fight() {
    if (lifePoints > 0) {

    } else {
      System.out.println(String.format("Le %s est mort !", ""));
    }
  }
}
