package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
  public static int userNb = -1;

  public static void main(String... args) {
    String instruction = "Entrer un nombre entre 1 et 10";
    String[] errors = {
        "\nLe nombre renseigné n'est pas dans l'intervalle...\n",
        "\nNon, non, non ! Pas de ça avec moi petit chenapan !\n",
        "\nHeu, tu rigoles ou quoi là ?\n",
        "\nAttends, t'es sûr de toi ?\n",
        "\nJ'ai dit un chiffre entre 1 et 10, coco ! Pas une chaîne !\n",
        "\nMmm, ma patience a des limites !...\n",
        "\n...\n",
        "\n???\n",
        "\nBon écoute, là ça fait un peu beaucoup tu trouves pas ? Faut pas pousser mémé dans les orties, hein ?\n",
        "\n...\n",
    };
    Scanner sc = new Scanner(System.in);
    int count = 1;
    boolean firstLoop = true;
    boolean fromCatch = false;

    do {
      if (!firstLoop && !fromCatch)
        System.out.println(errors[0]);
      else
        firstLoop = false;

      fromCatch = false;
      System.out.println(instruction);

      try {
        InteractifTantQue.userNb = sc.nextInt();
      } catch (Exception e) {
        fromCatch = true;
        sc.next();
        InteractifTantQue.userNb = -1;
        System.out.println(errors[count++]);
        if (count >= errors.length)
          count = 1;
      }
    } while (InteractifTantQue.userNb < 0 || InteractifTantQue.userNb > 10);

    sc.close();
    System.out.println("Yeaah !!!");
    System.out.println("Voilà ton nombre au cas où tu t'en rappelle plus: " + InteractifTantQue.userNb + ". BAM.");
  }
}
