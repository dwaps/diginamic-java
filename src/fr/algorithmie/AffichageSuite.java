package fr.algorithmie;

public class AffichageSuite {
  public static void main(String[] args) {

    print("Nombres de 1 à 10 inclu (for)");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    print("Nombres pairs de 0 à 10 inclu (for)");
    for (int i = 0; i <= 10; i += 2) {
      System.out.println(i);
    }

    print("Nombres impairs de 0 à 9 inclu (for)");
    for (int i = 1; i < 10; i += 2) {
      System.out.println(i);
    }

    
    print("Nombres de 1 à 10 inclu (while)");
    int count = 0;
    while (++count <= 10) {
      System.out.println(count);
    }

    print("Nombres pairs de 0 à 10 inclu (while)");
    count = 0;
    while (count <= 10) {
      System.out.println(count);
      count += 2;
    }

    print("Nombres impairs de 0 à 9 inclu (while)");
    count = 1;
    while (count <= 10) {
      System.out.println(count);
      count += 2;
    }
  }

  static void print(String str) {
    System.out.println();
    System.out.println(str);
  }
}
