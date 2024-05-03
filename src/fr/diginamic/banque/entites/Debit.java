package fr.diginamic.banque.entites;

public class Debit extends Operation {

  public Debit(String dateOperation, double montant) {
    super(dateOperation, montant);
  }

  @Override
  String getType() {
    return "DEBIT";
  }
}
