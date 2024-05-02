package fr.diginamic.entities;

public class AdressePostale {
  int numbRue;
  String rue;
  String codePostal;
  String ville;

  public AdressePostale(int numbRue, String rue, String codePostal, String ville) {
    this.numbRue = numbRue;
    this.rue = rue;
    this.codePostal = codePostal;
    this.ville = ville;
  }
}
