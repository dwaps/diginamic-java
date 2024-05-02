package fr.diginamic.salaire;

public class Salarie extends Intervenant {
  private double salaire;

  public Salarie(double salaire) {
    this.salaire = salaire;
  }

  @Override
  public double getSalaire() {
    return salaire;
  }

  @Override
  public void afficherDonnees() {
    super.afficherDonnees();
    System.out.println(String.format("""
        | Statut:           Salarié
        | Salaire mensuel:  %.2f euros
        """, salaire));
  }

}
