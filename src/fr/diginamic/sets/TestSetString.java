package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {
  public static void main(String[] args) {
    Set<String> countries = new HashSet<>(
        Set.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

    System.out.println("Before --> " + countries);

    // find and remove country with max letters
    // alternative to streams, for change
    Iterator<String> it = countries.iterator();
    String countryWithMoreLetters = null;
    int count = 0;
    while (it.hasNext()) {
      String country = it.next();
      if (count < country.length()) {
        count = country.length();
        countryWithMoreLetters = country;
      }
    }
    countries.remove(countryWithMoreLetters);

    System.out.println("After --> " + countries);
  }
}
