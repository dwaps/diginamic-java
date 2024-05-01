package fr.algorithmie;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifStockageNombre {
  public static void main(String[] args) {
    int[] userArray = {};
    final String MENU = """
        >>> MENU DU JEU <<<
        1. Ajouter un nombre.
        2. Afficher les nombres existants.
        Choisir une option (taper 1 ou 2):\s""";

    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        System.out.print(MENU);
        int userInput = sc.nextInt();

        if (userInput == 1) {
          System.out.print("Nouveau nombre >> ");
          userInput = sc.nextInt();
          userArray = extendsArray(userArray, userInput);
        } else if (userInput == 2) {
          if (userArray.length > 0) {
            System.out.println("Voici la liste des nombres que vous avez ajoutés :");
            System.out.println(Arrays.toString(userArray));
          } else {
            System.out.println("Aucun nombre ajouté pour le moment.");
          }
        }

        System.out.println("Voulez-vous recommencer ? [o/n]");
        if (!sc.next().equalsIgnoreCase("o"))
          break;
      }
    } catch (InputMismatchException e) {
      System.err.println("Veuillez saisir un nombre entier.");
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("\nBye");
  }

  static int[] extendsArray(int[] nbs, int nb) {
    int[] newArray = Arrays.copyOf(nbs, nbs.length + 1);
    newArray[newArray.length - 1] = nb;
    return newArray;
  }
}
