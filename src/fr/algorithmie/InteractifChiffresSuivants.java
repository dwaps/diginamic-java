package fr.algorithmie;

public class InteractifChiffresSuivants {
  public static void main(String[] args) {
    InteractifTantQue.main();

    int nb = InteractifTantQue.userNb;

    for (int i = nb + 1; i <= nb + 10; i++) {
      System.out.println(i);
    }
  }
}
