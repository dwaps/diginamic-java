package fr.diginamic.jdr;

import fr.diginamic.jdr.utils.CharacterEnum;
import fr.diginamic.jdr.utils.CharacterException;
import fr.diginamic.jdr.utils.RandomValue;
import fr.diginamic.jdr.utils.Range;

public class Player extends Character {
  private int score;

  public Player() {
    super(RandomValue.getStrenght(CharacterEnum.PLAYER), RandomValue.getLifePoints(CharacterEnum.PLAYER));
  }

  /**
   * Par défaut, le personnage partira avec 50 points de vie.
   */
  public Player(int strength) throws CharacterException {
    super(strength, RandomValue.getLifePoints(CharacterEnum.PLAYER));
    checkAttributes(CharacterEnum.PLAYER, Range.getPlayerRange());
  }

  public Player(int strength, int lifePoints) throws CharacterException {
    super(strength, lifePoints);
    checkAttributes(CharacterEnum.PLAYER, Range.getPlayerRange());
  }

  public int getScore() {
    return score;
  }

  public Boolean fight(Creature creature) {
    Boolean won = null;

    if (lifePoints > 0 && creature.lifePoints > 0) {
      previousLifePoints = lifePoints;
      creature.previousLifePoints = creature.lifePoints;
      int playerFightStrength = strength + RandomValue.getInt(1, 10);
      int creatureFightStrength = creature.strength + RandomValue.getInt(1, 10);

      if (playerFightStrength > creatureFightStrength) {
        creature.lifePoints -= (playerFightStrength - creatureFightStrength);

        if (creature.lifePoints <= 0) {
          creature.lifePoints = 0;
          score++;
          won = true;
        }

        if (creature.lifePoints == creature.previousLifePoints) {
          Game.displayStateOfGame("Hum, hum... ça lui a rien fait... Frappe plus fort !", this, creature);
        } else {
          Game.displayStateOfGame("Bravo, bien fait ! Tu l'as bien eu !", this, creature);
        }
      } else {
        lifePoints -= (creatureFightStrength - playerFightStrength);

        if (lifePoints <= 0) {
          lifePoints = 0;
          score = 0;
          won = false;
        }

        if (lifePoints == previousLifePoints) {
          Game.displayStateOfGame("Hum, hum... ça lui a rien fait... Frappe plus fort !", this, creature);
        } else {
          Game.displayStateOfGame("Ooooh, qu'est-ce qu'il t'a fait ! ça va ?!...", this, creature);
        }
      }
    }
    return won;
  }
}
