package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {
  public static void main(String[] args) {
    Cercle cercle = new Cercle(12.6d);
    Rectangle rectangle = new Rectangle(23, 78);
    Carre carre = new Carre(43);

    AffichageForme.afficher(cercle);
    AffichageForme.afficher(rectangle);
    AffichageForme.afficher(carre);
  }
}
