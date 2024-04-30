package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {
  public static void main(String[] args) {
    // Oui je sais, c'est pas très jolie cette déclaration 🐸
    int[] arr1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 },
        arr2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };

    int[] bigArr = new int[arr1.length + arr2.length];

    System.arraycopy(arr1, 0, bigArr, 0, arr1.length);
    System.arraycopy(arr2, 0, bigArr, arr1.length, arr2.length);

    System.out.println("Concaténation des tableaux: " + Arrays.toString(bigArr));
  }
}
