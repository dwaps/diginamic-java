package fr.algorithmie;

public class FirstLast {
  public static void main(String[] args) {
    int[] ar = { 8, 3, 6, 8 };
    boolean firstAndLastAreEquals = ar.length >= 1 && (ar[0] == ar[ar.length - 1]);

    System.out.println(firstAndLastAreEquals);
  }
}
