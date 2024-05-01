package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;
import fr.diginamic.entities.Theatre.TheatreException;

public class TestTheatre {
  public static void main(String[] args) {
    Theatre theatre = new Theatre("Les lamas lunatiques", 121);

    try {
      theatre.inscrire(67, 22);
      theatre.inscrire(50, 16.5);
      theatre.inscrire(4, 8.5);

      System.out.println(String.format("""
          Nombre total de clients: %d
          Recette total du théâtre: %.2f
          """, theatre.getTotalClients(), theatre.getTotalIncome()));
    } catch (TheatreException e) {
      System.err.println(e.getMessage());
    }
  }
}
