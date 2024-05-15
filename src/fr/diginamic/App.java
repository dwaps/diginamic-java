package fr.diginamic;

import java.io.IOException;
import java.util.ResourceBundle;

public class App {

  public static void main(String[] args) throws IOException {
    System.out.println("NOM DE L'APP --> " + ApplicationProperties.appName);
    System.out.println("VERSION --> " + ApplicationProperties.version);
    System.out.println("DEBUG LEVEL --> " + ApplicationProperties.debugLevel);
  }
}

class ApplicationProperties {
  private static final ResourceBundle rb = ResourceBundle.getBundle("coco");

  public static final String appName = rb.getString("application.name");
  public static final String version = rb.getString("application.version");
  public static final String debugLevel = rb.getString("application.debug.level");
}
