package fr.diginamic.jdr.utils;

public class Constants {
  public static String MENU = """
      ╔═══════════════════════════╗
      ║    >>> JEU DE ROLE <<<    ║
      ╚═══════════════════════════╝
        (pas un jeu drôle, hein)

      Sinopsis:

      > Il fait beau, il fait chaud et surtout c'est férié (un jour où tu fais rié quoi).
      > Tu as tout préparé: hamac, boissons fraîches, petits gâteaux, casquette...
      > Bref, tu ne reculera devant rien pour faire la sieste !
      >
      > Mais des créatures rodent et n'existent que pour t'empêcher de te reposer.
      > C'est ballot !
      >
      > Dès fois, c'est un loup, dès fois c'est un gobelin et dèz otres foit...
      > C'est un toll, houhouhououu... (t'as eu peur, hein ?)
      >
      > Si tu veux profiter du soleil, va falloir te battre !
      > Du coup, tu mets ta casquette sur le côté,
      > tu t'enveloppe de ton hamac comme d'une cape,
      > tu bois un coup,
      > flexion, extension, flexion... hop, hop !
      > ça y est, t'es prêt: tu vas leur donner une fessée dont ils vont se souvenir !

      Règles:
      > Un ennemi se présente à toi (aléatoire).
      > Il donne son nom, son âge et sa date de n... non je rigole.
      > Tu frappe le premier !
      > Il riposte.
      > Ainsi de suite.
      > Celui qui n'a plus de points de vie a perdu la manche.

      Alors ? Tu es prêt ? [On]\s""";

  public static final String START_STATE = """

      *** ETAT DE DEPART ***
      """;

  public static final String GAME_OVER = """
      ╔════════════════╗
      ║    GAME OVER   ║
      ╚════════════════╝

      > Ton personnage est décédé.
      > Il a obtenu le score de %d points.
      > Tu veux rejouer (ton score repartira de 0, tu t'en doutes bien) ? [On]\s""";
  public static final String YOU_WIN = """
      ╔════════════════╗
      ║    YOU WIN !   ║
      ╚════════════════╝

      > Ennemi vaincu ! Votre score actuel: %d\nTu veux rejouer ? [On]\s""";

  public static final int PLAYER_STRENGHT_MIN = 12;
  public static final int PLAYER_STRENGHT_MAX = 18;
  public static final int PLAYER_LIFE_POINTS_MIN = 20;
  public static final int PLAYER_LIFE_POINTS_MAX = 50;

  public static final int WOLF_STRENGHT_MIN = 3;
  public static final int WOLF_STRENGHT_MAX = 8;
  public static final int WOLF_LIFE_POINTS_MIN = 5;
  public static final int WOLF_LIFE_POINTS_MAX = 10;

  public static final int GOBLIN_STRENGHT_MIN = 5;
  public static final int GOBLIN_STRENGHT_MAX = 10;
  public static final int GOBLIN_LIFE_POINTS_MIN = 10;
  public static final int GOBLIN_LIFE_POINTS_MAX = 15;

  public static final int TROLL_STRENGHT_MIN = 10;
  public static final int TROLL_STRENGHT_MAX = 15;
  public static final int TROLL_LIFE_POINTS_MIN = 20;
  public static final int TROLL_LIFE_POINTS_MAX = 30;
}
