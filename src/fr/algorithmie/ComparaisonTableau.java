package fr.algorithmie;

import java.util.Arrays;

public class ComparaisonTableau {
  public static void main(String[] args) {
    int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
    int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
    int commons = 0;

    for (int nbArr1 : array1) {
      for (int nbArr2 : array2) {
        if (nbArr1 == nbArr2)
          commons++;
      }
    }

    System.out.println("Les 2 tableaux ont " + commons + " éléments en commun.");

    // Sans les doublons
    commons = 0;

    for (int nbArr1 : Arrays.stream(array1).distinct().toArray()) {
      for (int nbArr2 : Arrays.stream(array2).distinct().toArray()) {
        if (nbArr1 == nbArr2)
          commons++;
      }
    }

    System.out.println("Les 2 tableaux ont " + commons + " éléments en commun (sans les doublons).");
  }

}
