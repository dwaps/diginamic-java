package fr.diginamic.maison;

public abstract class Piece {
  protected TypePiece type;
  protected double superficie;
  protected int numEtage;

  public Piece() {
  }

  public Piece(TypePiece type, double superficie, int numEtage) {
    this.superficie = superficie;
    this.numEtage = numEtage;
    this.type = type;
  }

  public TypePiece getType() {
    return type;
  }

  public void setType(TypePiece type) {
    this.type = type;
  }

  public double getSuperficie() {
    return superficie;
  }

  public void setSuperficie(double superficie) {
    this.superficie = superficie;
  }

  public int getNumEtage() {
    return numEtage;
  }

  public void setNumEtage(int numEtage) {
    this.numEtage = numEtage;
  }

  @Override
  public String toString() {
    return String.format("""
        * %s
         > Superficie --> %.2f
         > Numéro étage --> %d
        """, type, superficie, numEtage);
  }
}
