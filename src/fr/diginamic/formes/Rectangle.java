package fr.diginamic.formes;

public class Rectangle extends Forme {
  private final int longueur;
  private final int largeur;

  public Rectangle(int longueur, int largeur) {
    this.longueur = longueur;
    this.largeur = largeur;
  }

  @Override
  public double calculerSurface() {
    return longueur * largeur;
  }

  @Override
  public double calculerPerimetre() {
    return 2 * (longueur + largeur);
  }
}
