package fr.algorithmie;

public class FirstLast6 {
  public static void main(String[] args) {
    int[] ar = { 3, 6, 8 };
    boolean firstOrLastIs6 = ar.length > 0 ? (ar[0] == 6 || ar[ar.length - 1] == 6) : false;

    System.out.println(firstOrLastIs6);
  }
}
