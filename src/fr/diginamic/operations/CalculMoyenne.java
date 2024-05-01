package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
  private static double[] array = {};

  public static void ajout(double nb) {
    double[] newArray = new double[array.length + 1];
    System.arraycopy(array, 0, newArray, 0, array.length);
    newArray[array.length] = nb;
    array = newArray;
  }

  public static double calcul() {
    // double result = 0;
    // for (double nb : array) {
    // result += nb;
    // }
    // result /= array.length;
    return Arrays.stream(array).average().orElse(Double.NaN);
  }
}
