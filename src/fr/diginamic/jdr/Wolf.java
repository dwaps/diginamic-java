package fr.diginamic.jdr;

import fr.diginamic.jdr.utils.CharacterEnum;
import fr.diginamic.jdr.utils.CharacterException;
import fr.diginamic.jdr.utils.RandomValue;
import fr.diginamic.jdr.utils.Range;

public class Wolf extends Creature {

  public Wolf() {
    super(RandomValue.getStrenght(CharacterEnum.WOLF), RandomValue.getLifePoints(CharacterEnum.WOLF));
  }

  /**
   * Par défaut, le personnage partira avec 50 points de vie.
   */
  public Wolf(int strength) throws CharacterException {
    super(strength, RandomValue.getLifePoints(CharacterEnum.WOLF));
    checkAttributes(CharacterEnum.WOLF, Range.getWolfRange());
  }

  public Wolf(int strength, int lifePoints) throws CharacterException {
    super(strength, lifePoints);
    checkAttributes(CharacterEnum.WOLF, Range.getWolfRange());
  }
}
