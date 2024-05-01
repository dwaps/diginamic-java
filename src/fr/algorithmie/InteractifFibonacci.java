package fr.algorithmie;

import java.math.BigInteger;
import java.util.Scanner;

public class InteractifFibonacci {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Choisissez un rang dans la suite de Fibonacci >> ");
      int userInput = sc.nextInt();
      System.out.println(
          String.format("Au rang %d de la suite de Fibonacci, nous avons : %s", userInput,
              getFibonacciNb(userInput).toString()));
    }
  }

  static BigInteger getFibonacciNb(int range) {
    if (range <= 0) {
      return BigInteger.ZERO;
    }

    BigInteger first = BigInteger.ZERO;
    BigInteger next = BigInteger.ONE;

    for (BigInteger i = BigInteger.valueOf(2); i.compareTo(BigInteger.valueOf(range)) <= 0; i = i.add(BigInteger.ONE)) {
      BigInteger temp = first.add(next);
      first = next;
      next = temp;
    }
    return next;
  }

}
