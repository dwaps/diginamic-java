package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {
  List<Piece> pieces = new ArrayList<Piece>();

  public void ajouterPiece(Piece piece) {
    if (!verifierPiece(piece)) {
      System.out.println("La pièce n'a pas été ajouté, tu t'en doutes bien !");
      return;
    }

    pieces.add(piece);
  }

  private boolean verifierPiece(Piece piece) {
    if (piece == null) {
      System.err.println("Renseigner une pièce valide !");
      return false;
    }
    if (piece.superficie <= 5) {
      System.err.println("Bon, siouplè, renseigner une surperfie raisonnable quand même !");
      return false;
    }
    if (piece.numEtage < 0) {
      System.err.println("Heu, on n'est pas spécialisé dans les sous-sols, désolé...");
      return false;
    }
    return true;
  }

  public double getSuperficieTotale() {
    return pieces
        .stream()
        .mapToDouble(Piece::getSuperficie)
        .sum();
  }

  public double getSuperficieParEtage(int etage) {
    return pieces
        .stream()
        .filter(p -> p.numEtage == etage)
        .mapToDouble(Piece::getSuperficie)
        .sum();
  }

  // je suis passé par `int type` uniquement pour respecter la consigne donnée
  // pour l'exercice
  public double getSuperficieParTypePiece(int type) {
    return pieces
        .stream()
        .filter(p -> p.getType().ordinal() == type)
        .mapToDouble(Piece::getSuperficie)
        .sum();
  }

  public int getNbPiecesParTypePiece(int type) {
    return (int) pieces
        .stream()
        .filter(p -> p.getType().ordinal() == type)
        .count();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    pieces.forEach(sb::append);
    return sb.toString();
  }
}
