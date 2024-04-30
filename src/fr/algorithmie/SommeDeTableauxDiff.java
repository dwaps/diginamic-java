package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {
  public static void main(String[] args) {
    int[] arr1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
    int[] arr2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

    int[] bigArr = new int[arr1.length + arr2.length];

    // En mode "dev relax"
    System.arraycopy(arr1, 0, bigArr, 0, arr1.length);
    System.arraycopy(arr2, 0, bigArr, arr1.length, arr2.length);

    System.out.println("Concaténation des tableaux: " + Arrays.toString(bigArr));

    // En mode "mains dans le cambouis"
    int[] bigArrII = new int[arr1.length + arr2.length];
    for (int i = 0; i < bigArrII.length; i++) {
      if (i < arr1.length) {
        bigArrII[i] = arr1[i];
        continue;
      }
      bigArrII[i] = arr2[i - arr1.length];
    }
    System.out.println("Concaténation des tableaux (en mode commando): " + Arrays.toString(bigArrII));
  }
}
