package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
  public static void main(String[] args) {
    int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
    // Copie du tableau avec l'aide de Java
    // int[] arrayCopy = Arrays.copyOf(array, array.length);
    // Copie du tableau avec l'aide de Java mais en se cassant un peu la tête
    // et en passant par une boucle while pour changer...
    int[] arrayCopy = new int[array.length];

    // for (int nb : array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
      arrayCopy[i] = array[i];
    }

    // Inversion à la mano
    System.out.println("Tableau d'origine --> \t\t" + Arrays.toString(array));
    reverse(array);
    System.out.println("Tableau inversé --> \t\t" + Arrays.toString(array));

    // Affichage de la copie du tableau d'origine
    System.out.println("Copie du tableau d'origine --> \t" + Arrays.toString(arrayCopy));
  }

  static void reverse(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }
}
