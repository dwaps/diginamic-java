package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CreationListe {
  public static void main(String[] args) {
    List<Integer> nbs = new ArrayList<>();
    IntStream.range(1, 101).forEach(nb -> nbs.add(nb));

    System.out.println(nbs.size());
  }
}
