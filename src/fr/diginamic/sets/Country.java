package fr.diginamic.sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Nb habitants: https://www.populationdata.net/palmares/population/
// PIB par habitants: https://fr.wikipedia.org/wiki/Liste_des_pays_par_PIB_nominal_par_habitant

public record Country(String name, int nbHab, double pib) {

  private static Set<Country> countries = new HashSet<>(Set.of(
      new Country("USA", 333_102_025, 69_375),
      new Country("France", 68_473_433, 45_028),
      new Country("Allemagne", 83_129_285, 50_787),
      new Country("UK", 67_81_234, 46_200),
      new Country("Italie", 59_983_122, 35_584),
      new Country("Japon", 126_050_098, 40_704),
      new Country("Chine", 1_411_778_724, 9608),
      new Country("Russie", 146_238_185, 11_327),
      new Country("Inde", 1_417_909_059, 2036)));

  public static void main(String[] args) {
    // pib max
    countries.stream().max(Comparator.comparingDouble(Country::pib));

    // pib total max
    countries.stream().max(Comparator.comparingDouble(country -> country.pib() * country.nbHab()));

    // pip total min ? --> uppercase
    Country countryWithMinPIB = countries.stream()
        .min(Comparator.comparingDouble(country -> country.pib() * country.nbHab()))
        .orElse(null);

    Set<Country> countries2 = countries.stream()
        .map(c -> {
          if (null != countryWithMinPIB && countryWithMinPIB.name().equals(c.name())) {
            return new Country(c.name().toUpperCase(), c.nbHab(), c.pib());
          }
          return c;
        })
        .collect(Collectors.toSet());
    System.out.println(countries2);

    // remove country with pib min
    countries2.remove(countryWithMinPIB);
    System.out.println(countries2);
  }

  @Override
  public final String toString() {
    return this.name();
  }
}
