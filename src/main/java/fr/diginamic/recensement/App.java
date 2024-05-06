package fr.diginamic.recensement;

import static fr.diginamic.recensement.utils.Constants.MENU;

import java.io.Console;

import fr.diginamic.recensement.entities.Places;
import fr.diginamic.recensement.services.PlaceService;
import fr.diginamic.recensement.utils.CSVLoader;

public class App {

  public static void main(String[] args) {
    App app = new App();
    CSVLoader.load();
    new PlaceService();

    app.run();
  }

  private void run() {
    Console console = System.console();
    String userInput = "";
    boolean firstLaunch = true;

    do {
      try {
        if (!firstLaunch)
          App.clearConsole();
        firstLaunch = false;
        userInput = console.readLine(MENU);
        int ui = Integer.parseInt(userInput);

        if (ui < 1 || (ui > 8 && ui != 9)) {
          System.out.println("\nIl n'y a pas d'option avec ce numéro...\n");
        } else {
          String response = Places.getResponse(console, userInput);
          System.out.println(response);
        }

      } catch (NumberFormatException e) {
        System.out.println("\nEntrée incorrecte...\n");
      }
    } while (null != userInput && !userInput.equals("9"));

    System.out.println("Fin du programme.");
  }

  private static void clearConsole() {
    try {
      Thread.sleep(4000);
      System.out.print("\033[H\033[2J");
      System.out.flush();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
