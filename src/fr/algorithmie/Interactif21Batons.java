package fr.algorithmie;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interactif21Batons {

  static String MENU = """
      ╔═══════════════════════════════════════════════╗
      ║    >>> BIENVENUE DANS LE JEU DU BATON <<<     ║
      ╚═══════════════════════════════════════════════╝

      Si tu aimes bien les bâtons, ce jeu est FAIT pour toi, yeah !
      (pas besoin des écouteurs: imagine qu'il y a de la musique en fond, le budget était limité désolé...)

      TU SAIS PAS COMMENT JOUER ?
      Voici la règle:

      > Il y a 21 bâtons. Et pas des moindres: de trèèèès jolis bâtons que t'as encore jamais vu.
      > L'ordinateur commence à jouer. Il prend entre 1 et 4 bâtons.
      > Du coup, il reste moins de bâtons (logiquement).
      > Et là tu viens, et tu prends à ton tour jusqu'à 4 jolis bâtons. Trop bien !
      >
      > Le jeu continue jusqu'à ce qu'il n'y ait plus de bâtons.
      > Le gagnant, c'est celui qui a réussi à ne PAS prendre le dernier bâton.
      """;

  public static void main(String[] args) {
    String result = "gagné";
    Scanner sc = new Scanner(System.in);
    int maxChoice = 4;
    List<Integer> sticks = IntStream.range(0, 21).boxed().collect(Collectors.toList());

    System.out.println(Interactif21Batons.MENU);

    while (sticks.size() > 0) {
      try {
        if (sticks.size() < maxChoice) {
          maxChoice = sticks.size();
        }

        // Computer plays
        int computerChoice = (int) (Math.random() * maxChoice) + 1;
        System.out.println(String.format("L'ordinateur a pris %d bâtons.", computerChoice));
        sticks.subList(0, computerChoice).clear();
        System.out.println(String.format("Il reste %d bâtons...", sticks.size()));

        if (sticks.size() == 0) {
          result = "gagné";
          break;
        }

        if (sticks.size() == 0) {
          break;
        }

        // User plays
        System.out.print("A ton tour de jouer >> ");
        int userInput = sc.nextInt();
        sc.nextLine();

        if (userInput >= 1 && userInput <= 4 && userInput <= sticks.size()) {
          sticks.subList(0, userInput).clear();
          System.out.println(String.format("Il reste %d bâtons...", sticks.size()));

          if (sticks.size() == 0) {
            result = "perdu";
            break;
          }
        } else {
          System.out.println("Nombre invalide ! Tans pis pour toi !");
        }
      } catch (Exception e) {
        System.out.println("Heu, sois cohérents stp !");
        sc.next();
      }
    }

    sc.close();
    System.out.println(String.format("Tu as %s !", result));
  }
}
