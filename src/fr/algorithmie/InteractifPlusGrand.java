package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String inputUser = "";
    int max = 0;

    do {
      inputUser = askUser("Donne-moi 10 nombres séparés par un seul espace >>> ");

      try {
        int[] inputs = Arrays.stream(inputUser.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        if (inputs.length != 10) {
          System.out.println("Il faut 10 chiffres, pas plus ni moins !");
        } else {
          max = Arrays.stream(inputs).max().getAsInt();
          break;
        }

      } catch (NumberFormatException e) {
        System.out
            .println("Il faut une suite de chiffres uniquement et SEPARES PAR DES ESPACES !\nNon, je m'énerve pas...");
      }
    } while (true);

    sc.close();
    System.out.println(max);
  }

  public static String askUser(String instruction) {
    String inputUser = "";

    while (true) {
      System.out.print(instruction);
      String error = "";

      try {
        inputUser = sc.nextLine();
        if (!inputUser.isEmpty()) {
          break;
        }
      } catch (Exception e) {
        beep();
      }

      System.err.println(error);
    }

    return inputUser;
  }

  public static void beep() {
    java.awt.Toolkit.getDefaultToolkit().beep();
  }
}
