package fr.diginamic.salaire;

public abstract class Intervenant {
  public String nom;
  public String prenom;

  public abstract double getSalaire();

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public void afficherDonnees() {
    System.out.print(String.format("""

        ~~~~~~~~~~~~~~~~~~~~~
        ~~~~~~~~~~~~~~~~~~~~~

        | INFOS INTERVENANT
        |
        | Nom:        %s
        | Prénom:     %s
        """, nom, prenom));
  }

}
