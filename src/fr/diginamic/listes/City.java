package fr.diginamic.listes;

public record City(String name, int nbHab) {
  @Override
  public final String toString() {
    return name;
  }
}
