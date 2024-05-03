package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
  public static void main(String[] args) {
    Compte[] comptes = {
        new Compte(123, 2098),
        new CompteTaux(999, 673, 23f),
    };

    for (Compte c : comptes) {
      System.out.println(c);
    }
  }
}
