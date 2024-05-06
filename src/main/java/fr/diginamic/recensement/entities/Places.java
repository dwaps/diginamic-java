package fr.diginamic.recensement.entities;

import static fr.diginamic.recensement.utils.Constants.QUESTIONS_SUP;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.diginamic.recensement.services.PlaceService;

public abstract class Places {
  public static final Map<Integer, Object> OPTIONS = new HashMap<>();
  private static List<Place> places = new ArrayList<>();

  static {
    new Thread(() -> {
      try {
        Thread.sleep(500);
        initCommonOptions();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
  }

  public static void add(Place place) {
    places.add(place);
  }

  public static List<Place> getPlaces() {
    return places;
  }

  private static void initCommonOptions() {
    OPTIONS.put(4, PlaceService.get10RegionsMorePopulated());
    OPTIONS.put(5, PlaceService.get10DptMorePopulated());
    OPTIONS.put(8, PlaceService.get10CitiesMorePopulated());
  }

  public static String getResponse(Console console, String userInput) {
    String response = "";
    String userChoice = "";

    try {
      int ui = Integer.parseInt(userInput);

      if (ui > 0 && ui < 4 || (ui == 6 || ui == 7)) {
        userChoice = console.readLine(QUESTIONS_SUP.get(ui));
        updateOptions(ui, userChoice);
      }

      if (null != OPTIONS.get(ui)) {
        response = buildResponse(OPTIONS.get(ui), userInput);
      }
    } catch (NumberFormatException e) {
      System.out.println("\nEntrée incorrecte...\n");
    }

    return response;
  }

  private static String buildResponse(Object response, String userChoice) {
    StringBuilder result = new StringBuilder("> REPONSE: ");

    switch (userChoice) {
      case "1":
        result.append("Cette ville compte " + response + " habitants.");
        break;
      case "2":
        result.append("Ce département compte " + response + " habitants.");
        break;
      case "3":
        result.append("Cette région compte " + response + " habitants.");
        break;
      case "4":
        result.append("Les 10 régions les plus peuplées sont:\n>> " +
            strFromList(response));
        break;
      case "5":
        result.append("Les 10 départements les plus peuplées sont:\n>> " + strFromList(response));
        break;
      case "6":
        result.append("Les 10 villes les plus peuplées de ce département sont:\n>> " + strFromList(response));
        break;
      case "7":
        result.append("Les 10 villes les plus peuplées de cette région sont:\n>> " + strFromList(response));
        break;
      case "8":
        result.append("Les 10 villes les plus peuplées de France sont:\n>> " + strFromList(response));
        break;
    }

    return result.toString();
  }

  private static String strFromList(Object str) {
    return ((List<?>) str).stream()
        .map(Object::toString)
        .collect(Collectors.joining(", "));
  }

  private static void updateOptions(int userInput, String userChoice) {
    switch (userInput) {
      case 1:
        OPTIONS.put(1, PlaceService.getPopulationByCity(userChoice));
        break;
      case 2:
        OPTIONS.put(2, PlaceService.getPopulationByDptCode(userChoice));
        break;
      case 3:
        OPTIONS.put(3, PlaceService.getPopulationByRegion(userChoice));
        break;
      case 6:
        OPTIONS.put(6, PlaceService.get10CitiesMorePopulatedByDpt(userChoice));
        break;
      case 7:
        OPTIONS.put(7, PlaceService.get10CitiesMorePopulatedByRegion(userChoice));
        break;
    }
  }
}
