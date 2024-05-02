package fr.diginamic.jdr;

import static fr.diginamic.jdr.utils.Constants.GAME_OVER;
import static fr.diginamic.jdr.utils.Constants.MENU;
import static fr.diginamic.jdr.utils.Constants.START_STATE;
import static fr.diginamic.jdr.utils.Constants.YOU_WIN;

import java.util.Scanner;

import fr.diginamic.jdr.utils.CharacterEnum;

public class Game {

  private Player player;
  private Creature creature;
  private static String userInput;
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.print(MENU);
    userInput = sc.nextLine();

    if (userInput.trim().equalsIgnoreCase("o")) {
      new Game().start();
    }

    sc.close();
    System.out.println("Bye :)");
    System.out.println();
  }

  private void start() {
    this.init(true);
    this.play();
  }

  private void init(boolean createPlayer) {
    if (createPlayer)
      player = new Player();
    this.init();
  }

  private void init() {
    switch (CharacterEnum.getRandom()) {
      case WOLF:
        creature = new Wolf();
        break;
      case GOBLIN:
        creature = new Goblin();
        break;
      case TROLL:
        creature = new Troll();
        break;
      default:
    }

    displayStateOfGame(START_STATE, player, creature);
    System.out.println("Entre la touche f à chaque fois que tu veux frapper\n");
  }

  private void play() {
    boolean replayGame = false;
    boolean fightAgain = false;
    Boolean won = null;

    try {
      userInput = sc.nextLine();

      while (!userInput.equalsIgnoreCase("f")) {
        System.out.println("Heu, c'est pas f ça !");
        userInput = sc.nextLine();
      }

      do {
        won = player.fight(creature);

        if (won != null) {
          String result = !won
              ? String.format(GAME_OVER, player.getScore())
              : String.format(YOU_WIN, player.getScore());
          java.awt.Toolkit.getDefaultToolkit().beep();
          System.err.print(result);
        } else {
          System.out.print("T'as envie de frapper ? [f] ");
        }

        userInput = sc.nextLine();
        fightAgain = userInput.equalsIgnoreCase("f");
        replayGame = userInput.equalsIgnoreCase("o");

      } while (!replayGame && fightAgain);

      if (!fightAgain) {
        System.out.println("\nOk, j'ai compris: t'as plus envie de jouer...");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    if (replayGame && (won != null && won)) {
      this.init();
      this.play();
    } else if (replayGame) {
      this.init(true);
      this.play();
    }
  }

  public static void displayStateOfGame(String mss, Player player, Creature creature) {
    System.out.println(
        String.format("""

              %s
              > Player: (strength: %d, life: %d)
              > Ennemi: (strength: %d, life: %d)
            """, mss,
            player.strength, player.lifePoints,
            creature.strength, creature.lifePoints));
  }
}
