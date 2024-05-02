package fr.diginamic.entities2;

import fr.diginamic.entities.AdressePostale;

public class Personne {
  private String nom;
  private String prenom;
  private AdressePostale adresse;

  public Personne() {
  }

  public Personne(String nom, String prenom, AdressePostale adresse) {
    this.nom = nom;
    this.prenom = prenom;
    this.adresse = adresse;
  }

  public void afficher() {
    System.out.println(String.format("""

          > QUI EST-TU ?
          Nom: %s
          Prénom: %s
        """, nom.toUpperCase(), prenom));
  }

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

  public AdressePostale getAdresse() {
    return adresse;
  }

  public void setAdresse(AdressePostale adresse) {
    this.adresse = adresse;
  }
}
