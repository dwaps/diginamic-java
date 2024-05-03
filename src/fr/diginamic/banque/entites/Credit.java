package fr.diginamic.banque.entites;

public class Credit extends Operation {

  public Credit(String dateOperation, double montant) {
    super(dateOperation, montant);
  }

  @Override
  String getType() {
    return "CREDIT";
  }

}
