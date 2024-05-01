package fr.diginamic.entities;

import java.text.DecimalFormat;

public class Cercle {
  private static final DecimalFormat DF = new DecimalFormat("#.##");

  private final double radius;

  public Cercle(double radius) {
    this.radius = radius;
  }

  public String getPerimeter() {
    return DF.format(2 * Math.PI * this.radius);
  }

  public String getSurface() {
    return DF.format(Math.PI * Math.pow(this.radius, 2));
  }
}
