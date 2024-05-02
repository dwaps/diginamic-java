package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.TypePiece;
import fr.diginamic.maison.Wc;

public class TestMaison {

  public static void main(String[] args) {
    Maison maison = buildMaison();

    // maison.ajouterPiece(null);

    System.out.println("\n\nPIECES DE LA MAISON");
    System.out.println(maison);

    // Superficie totale de la maison
    System.out.println(maison.getSuperficieTotale());

    // Superficie totale par étage
    System.out.println(maison.getSuperficieParEtage(0));
    System.out.println(maison.getSuperficieParEtage(1));
    System.out.println(maison.getSuperficieParEtage(2));

    // Superficie totale par type de pièce
    System.out.println(maison.getSuperficieParTypePiece(TypePiece.CHAMBRE.ordinal()));
    System.out.println(maison.getSuperficieParTypePiece(TypePiece.SALLE_DE_BAIN.ordinal()));
    System.out.println(maison.getSuperficieParTypePiece(TypePiece.CUISINE.ordinal()));

    // Nombre de pièces par type
    System.out.println(maison.getNbPiecesParTypePiece(TypePiece.CHAMBRE.ordinal()));
    System.out.println(maison.getNbPiecesParTypePiece(TypePiece.SALLE_DE_BAIN.ordinal()));
    System.out.println(maison.getNbPiecesParTypePiece(TypePiece.CUISINE.ordinal()));
  }

  static Maison buildMaison() {
    Maison maison = new Maison();

    // Au RdC: un wc, une salle de bain, une petite chambre
    maison.ajouterPiece(new Wc(12, 0));
    maison.ajouterPiece(new SalleDeBain(18.52, 0));
    maison.ajouterPiece(new Chambre(12.4, 0));

    // // Au 1er étage: une cuisine et un salon
    maison.ajouterPiece(new Cuisine(45, 1));
    maison.ajouterPiece(new Salon(37, 1));

    // // Au 2ème étage: 3 chambres et une salle de bain
    maison.ajouterPiece(new Chambre(23, 2));
    maison.ajouterPiece(new Chambre(22.5, 2));
    maison.ajouterPiece(new Chambre(16, 2));
    maison.ajouterPiece(new SalleDeBain(11.9, 2));

    return maison;
  }
}
