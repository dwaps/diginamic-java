package fr.diginamic.banque.entites;

public class Compte {
  private int num;
  private double solde;

  public Compte(int num, double solde) {
    this.num = num;
    this.solde = solde;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public double getSolde() {
    return solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }

  @Override
  public String toString() {
    return String.format("""
          Numéro de compte: %d
          Solde du compte: %.2f
        """, num, solde);
  }
}
