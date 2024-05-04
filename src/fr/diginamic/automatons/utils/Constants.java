package fr.diginamic.automatons.utils;

import java.lang.reflect.Field;

public class Constants {
  public static String PROPERTY_KEY_TYPE = "type";
  public static String PROPERTY_KEY_GRID_SIZE = "grid.size";

  static {
    try {
      buildPropertiesConstants();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  private static void buildPropertiesConstants() throws IllegalAccessException {
    Field[] fields = Constants.class.getDeclaredFields();

    for (Field f : fields) {
      String newName = "fr.diginamic." + (String) f.get(null);
      f.set(null, newName);
    }
  }

}
