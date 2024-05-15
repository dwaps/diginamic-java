package fr.diginamic.listes;

public record City(String name, int nbHab) {

  @Override
  public final boolean equals(Object arg0) {
    if (!(arg0 instanceof City)) {
      return false;
    }

    City city = (City) arg0;
    return city.name().equals(this.name()) && city.nbHab() == this.nbHab();
  }

  @Override
  public final String toString() {
    return name;
  }
}
