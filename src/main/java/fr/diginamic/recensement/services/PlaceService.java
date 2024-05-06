package fr.diginamic.recensement.services;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.diginamic.recensement.entities.Place;
import fr.diginamic.recensement.entities.Places;

public class PlaceService {
  private static List<Place> places;

  public PlaceService() {
    places = Places.getPlaces();
  }

  public static int getPopulationByCity(String city) {
    Place place = (Place) places.stream()
        .filter(p -> p.getMunicipalityName().equals(city))
        .findFirst()
        .orElse(null);

    if (null != place)
      return place.getMunicipalityPopulation();
    else
      return -1;
  }

  public static int getPopulationByDptCode(String dptCode) {
    return places.stream()
        .filter(p -> p.getDptCode().equals(dptCode))
        .mapToInt(Place::getTotalPopulation)
        .sum();
  }

  public static int getPopulationByRegion(String region) {
    return places.stream()
        .filter(p -> p.getRegionName().equals(region))
        .mapToInt(Place::getTotalPopulation)
        .sum();
  }

  public static List<String> get10RegionsMorePopulated() {
    Map<String, Integer> regionsPopulation = places.stream()
        .collect(Collectors.groupingBy(Place::getRegionName, Collectors.summingInt(Place::getTotalPopulation)));

    return regionsPopulation.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(10)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
  }

  public static List<String> get10DptMorePopulated() {
    Map<String, Integer> deptPopulation = places.stream()
        .collect(Collectors.groupingBy(Place::getDptCode, Collectors.summingInt(Place::getTotalPopulation)));
    return deptPopulation.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(10)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
  }

  public static List<String> get10CitiesMorePopulatedByDpt(String dptCode) {
    List<Place> citiesInDepartment = places.stream()
        .filter(place -> place.getDptCode().equals(dptCode))
        .sorted(Comparator.comparingInt(Place::getTotalPopulation).reversed())
        .limit(10)
        .collect(Collectors.toList());

    if (citiesInDepartment != null) {
      return citiesInDepartment.stream()
          .map(Place::getMunicipalityName)
          .collect(Collectors.toList());
    } else {
      System.out.println("Ce département n'existe pas dans la base de données.");
      return null;
    }
  }

  public static List<String> get10CitiesMorePopulatedByRegion(String region) {

    List<Place> citiesInRegion = places.stream()
        .filter(place -> place.getRegionName().equals(region))
        .sorted(Comparator.comparingInt(Place::getTotalPopulation).reversed())
        .limit(10)
        .collect(Collectors.toList());

    if (null != citiesInRegion) {
      return citiesInRegion.stream()
          .map(Place::getMunicipalityName)
          .collect(Collectors.toList());
    } else {
      System.out.println("Cette région n'existe pas dans la base de données.");
      return null;
    }
  }

  public static List<String> get10CitiesMorePopulated() {
    return places.stream()
        .sorted(Comparator.comparingInt(Place::getTotalPopulation).reversed())
        .limit(10)
        .map(Place::getMunicipalityName)
        .collect(Collectors.toList());
  }
}
