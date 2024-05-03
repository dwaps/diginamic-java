package fr.diginamic.banque.entites;

public class TestOperation {
  public static void main(String[] args) {
    Operation[] operations = {
        new Credit("1956-12-11", 17),
        new Credit("2023-11-20", 29),
        new Debit("2024-01-22", 430d),
        new Credit("2024-05-12", 120d),
        new Credit("2024-05-12", 600),
    };

    for (Operation op : operations) {
      System.out.println("TYPE OPERATION >> " + op.getType());
      System.out.println("Date de l'opération: " + op.dateOperation);
      System.out.println("Montant de l'opération: " + op.montant);
      System.out.println();
    }

    System.out.println("SUR LE COMTE ACTUELLEMENT");
    Operation.displayNotif();
    System.out.println(Operation.total);
  }
}
