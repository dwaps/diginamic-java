package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
  public static void main(String[] args) {
    Compte compte = new Compte(123, 2098);
    System.out.println(compte);
  }
}
