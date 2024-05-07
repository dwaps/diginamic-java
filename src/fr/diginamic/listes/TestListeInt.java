package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
  public static void main(String[] args) {
    // use new ArrayList because of remove smallest operation (l. 29)
    List<Integer> ints = new ArrayList<>(List.of(-1, 5, 7, 3, -2, 4, 8, 5));

    System.out.println(ints);
    System.out.println(ints.size());

    // smallest
    // System.out.println("biggest --> " + Collections.min(ints));
    // alternative (if you want to go the extra mile):
    int smallest = Integer.MAX_VALUE;
    for (int nb : ints) {
      if (nb < smallest)
        smallest = nb;
    }
    System.out.println("Smallest --> " + smallest);

    // biggest
    System.out.println("biggest --> " + Collections.max(ints));

    // Remove the smallest
    ints.remove(Collections.min(ints));
    System.out.println(ints);

    // all negatives must be positives
    ints.replaceAll(nb -> Math.abs(nb));
    System.out.println(ints);
  }
}
