package fr.diginamic.listes;

public class TestEquals {
  public static void main(String[] args) {
    City city1 = new City("Marseille", 10);
    City cityIdem1 = new City("Marseille", 10);
    City city2 = new City("Bordeaux", 4);

    System.out.println(city1.equals(cityIdem1));
    System.out.println(city1 == cityIdem1);
    System.out.println(city1 == city2);
  }
}
