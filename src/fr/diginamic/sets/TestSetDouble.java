package fr.diginamic.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
  public static void main(String[] args) {
    Set<Double> doubles = new HashSet<>(Set.of(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
    // doubles.add(1.5d);
    // doubles.add(8.25d);
    // doubles.add(-7.32d);
    // doubles.add(13.3d);
    // doubles.add(-12.45d);
    // doubles.add(48.5d);
    // doubles.add(0.01d);

    System.out.println(doubles);

    // max
    System.out.println(Collections.max(doubles));

    // min
    System.out.println(Collections.min(doubles));

    // remone mon
    doubles.remove(Collections.min(doubles));

    System.out.println(doubles);
  }
}
