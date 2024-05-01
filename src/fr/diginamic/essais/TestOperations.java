package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
  public static void main(String[] args) {
    Operations op = new Operations();
    try {
      Double res = op.calcul(4.2d, 3d, '+');
      System.out.println("4.2 + 3 = " + res);
      res = op.calcul(5d, 3.8d, '-');
      System.out.println("5 - 3.8 = " + res);
      res = op.calcul(10.23d, 22.75d, '/');
      System.out.println("10.23 / 22.75 = " + res);
      res = op.calcul(213d, 3.2d, '*');
      System.out.println("213 * 3.2 = " + res);

      op.calcul(23, 32, 'f');
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
