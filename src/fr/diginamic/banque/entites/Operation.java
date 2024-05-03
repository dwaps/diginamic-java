package fr.diginamic.banque.entites;

public abstract class Operation {
  protected static double total;

  protected String dateOperation;
  protected double montant;

  public Operation(String dateOperation, double montant) {
    this.dateOperation = dateOperation;
    this.montant = montant;
    calculMontantActuelDisponible();
  }

  abstract String getType();

  private double calculMontantActuelDisponible() {
    if (getType() == "CREDIT") {
      total += montant;
    } else {
      total -= montant;
    }
    return total;
  }

  public static void displayNotif() {
    System.out.println(total > 0 ? "ça, t'es bien au niveau du compte !\nTu as toute la sympathie de ton banquier :)"
        : "attention, t'es à découvert là !");
  }
}
