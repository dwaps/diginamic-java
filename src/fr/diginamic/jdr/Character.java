package fr.diginamic.jdr;

import java.util.HashMap;
import java.util.Map;

import fr.diginamic.jdr.utils.CharacterEnum;
import fr.diginamic.jdr.utils.CharacterException;
import fr.diginamic.jdr.utils.Range;

public abstract class Character {
  int strength;
  int previousLifePoints;
  int lifePoints;

  public Character(int strength, int lifePoints) {
    this.strength = strength;
    this.lifePoints = lifePoints;
  }

  protected void checkAttributes(CharacterEnum character, Range range) throws CharacterException {
    Map<String, String> errors = new HashMap<>();

    errors.put("strength",
        String.format(
            "La force du %s doit se situer entre %d et %d.",
            character, range.strenghtMin, range.strenghtMax));

    errors.put("lifePoints",
        String.format(
            "Les points de vie du %s doivent être compris entre %d et %d.",
            character, range.lifePointsMin, range.lifePointsMax));

    boolean errorStrength = !(strength >= range.strenghtMin && strength <= range.strenghtMax);
    boolean errorLifePoints = !(lifePoints >= range.lifePointsMin && lifePoints <= range.lifePointsMax);

    if (errorStrength)
      throw new CharacterException(errors.get("strength"));
    if (errorLifePoints)
      throw new CharacterException(errors.get("lifePoints"));
  }
}
