package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
  private int nbOfWorkDays;
  private double dailySalary;

  public void setNbOfWorkDays(int nbOfWorkDays) {
    this.nbOfWorkDays = nbOfWorkDays;
  }

  public int getNbOfWorkDays() {
    return nbOfWorkDays;
  }

  public void setDailySalary(double dailySalary) {
    this.dailySalary = dailySalary;
  }

  @Override
  public double getSalaire() {
    return nbOfWorkDays * dailySalary;
  }

  @Override
  public void afficherDonnees() {
    super.afficherDonnees();
    System.out.println(String.format("""
        | Statut:             Pigiste
        | Salaire journalier: %d euros
        | Salaire total:      %.2f euros
        """, nbOfWorkDays, dailySalary));
  }
}
