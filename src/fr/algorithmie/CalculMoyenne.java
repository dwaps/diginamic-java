package fr.algorithmie;

import java.text.DecimalFormat;

public class CalculMoyenne {
  public static void main(String[] args) {
    int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
    double average = 0;
    DecimalFormat df = new DecimalFormat("#.##");

    for (int nb : array) {
      average += nb;
    }

    average /= array.length;

    System.out.println("Moyenne (arrondie à 2 chiffres après la virgule): " + df.format(average));
  }
}
