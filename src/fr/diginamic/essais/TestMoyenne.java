package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
  public static void main(String[] args) {
    CalculMoyenne.ajout(10);
    display();

    CalculMoyenne.ajout(34);
    display();

    CalculMoyenne.ajout(12.5);
    display();
  }

  static void display() {
    System.out.println("Calcul moyenne : " + CalculMoyenne.calcul());
  }
}
