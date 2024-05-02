package fr.diginamic.jdr;

import fr.diginamic.jdr.utils.CharacterEnum;
import fr.diginamic.jdr.utils.CharacterException;
import fr.diginamic.jdr.utils.RandomValue;
import fr.diginamic.jdr.utils.Range;

public class Troll extends Creature {

  public Troll() {
    super(RandomValue.getStrenght(CharacterEnum.TROLL), RandomValue.getLifePoints(CharacterEnum.TROLL));
  }

  /**
   * Par défaut, le personnage partira avec 50 points de vie.
   */
  public Troll(int strength) throws CharacterException {
    super(strength, RandomValue.getLifePoints(CharacterEnum.TROLL));
    checkAttributes(CharacterEnum.TROLL, Range.getTrollRange());
  }

  public Troll(int strength, int lifePoints) throws CharacterException {
    super(strength, lifePoints);
    checkAttributes(CharacterEnum.TROLL, Range.getTrollRange());
  }
}
