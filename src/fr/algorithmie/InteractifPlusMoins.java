package fr.algorithmie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractifPlusMoins {
  public static void main(String[] args) {
    int randomNB = (int) (Math.random() * 100) + 1;
    int userInput = 0;

    try (Scanner sc = new Scanner(System.in)) {
      do {
        System.out.print("Trouve le nombre à trouver ! >> ");
        try {
          userInput = sc.nextInt();
          System.out.println(userInput > randomNB ? "C'est moins" : "C'est plus");
        } catch (InputMismatchException e) {
          sc.next();
          System.err.println("Rentre un nombre !");
          // e.printStackTrace();
        }
      } while (randomNB != userInput);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Great ! Le nombre a trouvé était bien : " + randomNB);
  }
}
