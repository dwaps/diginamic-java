package fr.diginamic.essais;

import fr.diginamic.entities.Cercle;

public class TestCercle {

  private final static String STR_PERIMETER = "Voici le périmètre du cercle ";
  private final static String STR_SURFACE = "Voici la surface du cercle ";

  public static void main(String[] args) {
    Cercle c1 = new Cercle(78d);
    Cercle c2 = new Cercle(28d);

    display(STR_PERIMETER, c1);
    display(STR_PERIMETER, c2);
  }

  static void display(String str, Cercle c) {
    System.out.println(STR_PERIMETER + " c2: " + c.getPerimeter());
    System.out.println(STR_SURFACE + " c1: " + c.getSurface());
  }
}
