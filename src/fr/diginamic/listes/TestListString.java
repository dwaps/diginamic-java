package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestListString {
  public static void main(String[] args) {
    List<String> cities = List.of("Nice", "Carcassone", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

    // more letters
    String longest = cities.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    System.out.println(longest);

    // uppercase
    cities = cities.stream().map(String::toUpperCase).toList();
    System.out.println(cities);

    // remove starting with N
    List<String> mofiableCities = new ArrayList<>();
    mofiableCities.addAll(cities);
    mofiableCities.removeIf(city -> city.startsWith("N"));
    System.out.println(mofiableCities);
  }

}
