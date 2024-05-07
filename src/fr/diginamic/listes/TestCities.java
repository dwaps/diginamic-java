package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestCities {
  public static void main(String[] args) {
    List<City> cities = new ArrayList<>();
    cities.add(new City("Nice", 343000));
    cities.add(new City("Carcassonne", 47800));
    cities.add(new City("Narbonne", 53400));
    cities.add(new City("Lyon", 484000));
    cities.add(new City("Foix", 8700));
    cities.add(new City("Pau", 77200));
    cities.add(new City("Marseille", 850700));
    cities.add(new City("Tarbes", 40600));

    System.out.println(cities);
    City city;

    // display city of nbHab max
    city = cities.stream()
        .max(Comparator.comparingInt(City::nbHab))
        .orElse(null);
    System.out.println(city);

    // remove city of nbHab min
    City city2 = cities.stream()
        .min(Comparator.comparingInt(City::nbHab))
        .orElse(null);
    cities.removeIf(c -> c.equals(city2));

    // update more than 100000 nbHab
    cities = cities.stream()
        .map(c -> {
          if (c.nbHab() > 100000) {
            return new City(c.name().toUpperCase(), c.nbHab());
          }
          return c;
        })
        .toList();

    System.out.println(cities);
  }
}
