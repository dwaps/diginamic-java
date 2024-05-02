package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {
  public static void main(String[] args) {
    Salarie salarie = new Salarie(2317.34);
    Pigiste pigiste = new Pigiste();

    salarie.setNom("DUPONT");
    salarie.setPrenom("Pedro");

    pigiste.setNom("DUPOND");
    pigiste.setPrenom("Franco");

    pigiste.setDailySalary(330.83);
    pigiste.setNbOfWorkDays(6);

    System.out.println(salarie.getPrenom() + " gagne " + salarie.getSalaire() + " euros par mois");
    System.out.println(
        pigiste.getPrenom() + " a gagné " + pigiste.getSalaire() + " euros pour " + pigiste.getNbOfWorkDays()
            + " jours de travail");

    salarie.afficherDonnees();
    pigiste.afficherDonnees();
  }
}
