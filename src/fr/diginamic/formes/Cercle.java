package fr.diginamic.formes;

public class Cercle extends Forme {
  private final double radius;

  public Cercle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculerSurface() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  @Override
  public double calculerPerimetre() {
    return 2 * Math.PI * this.radius;
  }
}
