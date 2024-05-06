package fr.diginamic.automatons.utils;

public class ClearConsole {
  public static void clear(long speed) {
    try {
      Thread.sleep(speed);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
