package fr.diginamic.entities;

public class AdressePostale {
  private int numbRue;
  private String rue;
  private String codePostal;
  private String ville;

  public int getNumbRue() {
    return numbRue;
  }

  public void setNumbRue(int numbRue) {
    this.numbRue = numbRue;
  }

  public String getRue() {
    return rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public String getCodePostal() {
    return codePostal;
  }

  public void setCodePostal(String codePostal) {
    this.codePostal = codePostal;
  }

  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public AdressePostale(int numbRue, String rue, String codePostal, String ville) {
    this.numbRue = numbRue;
    this.rue = rue;
    this.codePostal = codePostal;
    this.ville = ville;
  }
}
