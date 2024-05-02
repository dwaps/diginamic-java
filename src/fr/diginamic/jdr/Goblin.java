package fr.diginamic.jdr;

import fr.diginamic.jdr.utils.CharacterEnum;
import fr.diginamic.jdr.utils.CharacterException;
import fr.diginamic.jdr.utils.RandomValue;
import fr.diginamic.jdr.utils.Range;

public class Goblin extends Creature {

  public Goblin() {
    super(RandomValue.getStrenght(CharacterEnum.GOBLIN), RandomValue.getLifePoints(CharacterEnum.GOBLIN));
  }

  /**
   * Par défaut, le personnage partira avec 50 points de vie.
   */
  public Goblin(int strength) throws CharacterException {
    super(strength, RandomValue.getLifePoints(CharacterEnum.GOBLIN));
    checkAttributes(CharacterEnum.GOBLIN, Range.getGoblinRange());
  }

  public Goblin(int strength, int lifePoints) throws CharacterException {
    super(strength, lifePoints);
    checkAttributes(CharacterEnum.GOBLIN, Range.getGoblinRange());
  }
}
