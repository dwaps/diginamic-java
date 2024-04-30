package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nb = 0;
    int sum = 0;

    do {
      System.out.print("Saisi un nombre >>> ");
      String error = "";

      try {
        nb = sc.nextInt();
        if (nb <= 1) {
          beep();
          error = "Oui, j'ai oublié de te dire: il faut un nombre supérieur à 1 ok ?";
        }
      } catch (Exception e) {
        beep();
        sc.next();
        error = "Un NOMBRE s'il te plait !...";
      }

      System.err.println(error);
    } while (nb <= 1);

    sc.close();

    for (int i = 0; i <= nb; i++) {
      sum += i;
    }

    System.out.println("Résultat --> " + sum);
  }

  public static void beep() {
    java.awt.Toolkit.getDefaultToolkit().beep();
  }
}
