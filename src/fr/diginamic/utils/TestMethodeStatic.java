package fr.diginamic.utils;

public class TestMethodeStatic {
  private static int a;
  private static int b;
  private static String chaine;

  static {
    chaine = "12";
    a = 34;
    b = 67;
  }

  public static void main(String[] args) {
    System.out.println(chaine);

    try {
      // Conversion de chaine en int
      int nb = Integer.parseInt(chaine);

      // Nombre max entre a et b
      System.out.println(Integer.max(a, b));
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
