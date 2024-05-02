package fr.diginamic.entities;

import fr.diginamic.entities2.Personne;

public class TestPersonne {
  public static void main(String[] args) {
    Personne coco = new Personne("DUPONT", "Coco", new AdressePostale(14, "Rue de la liberté", "61177", "Bordol"));
    Personne jaco = new Personne("DUPOND", "Jaco", new AdressePostale(67, "Rue des moustiques", "98177", "Nimal"));

    coco.afficher();

    coco.setAdresse(new AdressePostale(2891, "Rue pas droite", "12122", "Aic-en-Potence"));
  }
}
