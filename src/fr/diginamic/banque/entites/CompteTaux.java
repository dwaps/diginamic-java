package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
  float tauxRemuneration;

  public CompteTaux(int num, double solde, float tauxRemuneration) {
    super(num, solde);
    this.tauxRemuneration = tauxRemuneration;
  }

  @Override
  public String toString() {
    this.name = CompteTaux.class.getSimpleName();
    return super.toString() + "\nTaux de rémunétation: " + tauxRemuneration;
  }
}
