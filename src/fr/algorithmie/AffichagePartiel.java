package fr.algorithmie;

public class AffichagePartiel {
  enum DisplayMode {
    GREATER_THAN_3,
    EVEN_NUMBERS,
    ODD_NUMBERS,
    EVEN_INDEXES_VALUES,
  }

  public static void main(String[] args) {
    int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

    for (DisplayMode mode : DisplayMode.values()) {
      print(mode, array);
    }
  }

  static void print(DisplayMode dm, int[] array) {
    String str = "";

    switch (dm) {
      case GREATER_THAN_3:
        str = "Entiers suppérieurs à 3 dans le tableau -->\t";
        for (int nb : array) {
          if (nb > 3) {
            str += nb + " ";
            continue;
          }
        }
        break;
      case EVEN_INDEXES_VALUES:
        str = "Valeurs correspondant aux index pairs -->\t";
        for (int i = 0; i < array.length; i++) {
          if (i % 2 == 0) {
            str += array[i] + " ";
            continue;
          }
        }
        break;
      case EVEN_NUMBERS:
        str = "Entiers pairs du tableau -->\t\t\t";
        for (int nb : array) {
          if (nb % 2 == 0) {
            str += nb + " ";
            continue;
          }
        }
        break;
      case ODD_NUMBERS:
        str = "Entiers impairs du tableau -->\t\t\t";
        for (int nb : array) {
          if (nb % 2 == 1) {
            str += nb + " ";
            continue;
          }
        }
        break;
    }
    System.out.println();
    System.out.println(str);
  }
}
