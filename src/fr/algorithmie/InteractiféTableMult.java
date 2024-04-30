package fr.algorithmie;

public class InteractiféTableMult {
  public static void main(String[] args) {
    InteractifTantQue.main();

    String str = "\n>>> TABLE DE MULTIPLICATION AVEC TON NOMBRE <<<";
    str += "\n(pas ton ombre, hein ? me fait pas dire ckejépadi)\n";
    int nb = InteractifTantQue.userNb;

    for (int i = 1; i <= 10; i++) {
      int result = nb * i;
      str += "\n| " + i + (i > 9 ? "" : " ") + " * " + InteractifTantQue.userNb + " = " + result
          + (result > 9 ? "" : " ") + " |";
    }

    System.err.println(str);
  }
}
