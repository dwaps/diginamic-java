package fr.diginamic.entities;

public class Theatre {
  private String name;
  private int maxCap;
  private int totalClients = 0;
  private double totalIncome = 0;

  public class TheatreException extends Exception {
    TheatreException(String mss) {
      super(mss);
    }
  }

  public Theatre(String name, int maxCap) {
    this.name = name;
    this.maxCap = maxCap;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMaxCap() {
    return maxCap;
  }

  public void setMaxCap(int maxCap) {
    this.maxCap = maxCap;
  }

  public int getTotalClients() {
    return totalClients;
  }

  public void setTotalClients(int totalClients) {
    this.totalClients = totalClients;
  }

  public double getTotalIncome() {
    return totalIncome;
  }

  public void setTotalIncome(double totalIncome) {
    this.totalIncome = totalIncome;
  }

  public void inscrire(int nbClients, double priceForOnePerson) throws TheatreException {
    if (totalClients + nbClients <= maxCap) {
      totalClients += nbClients;
      totalIncome += priceForOnePerson * nbClients;
    } else {
      throw new TheatreException("Trop de gens là !");
    }
  }
}
