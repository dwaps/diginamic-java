package fr.diginamic.entities;

public class Salarie {
  String nom;
  String prenom;
  double salaire;

  public Salarie(String nom, String prenom, double salaire) {
    this.nom = nom;
    this.prenom = prenom;
    this.salaire = salaire;
  }

  @Override
  public String toString() {
    return String.format("""

        ~~~~~~~~~~~~~~~~~~~~~
        ~~~~~~~~~~~~~~~~~~~~~

        | INFOS SALARIE
        | Nom:      %s
        | Prénom:   %s
        | Salaire:  %.2f

        """, nom, prenom, salaire);
  }
}
