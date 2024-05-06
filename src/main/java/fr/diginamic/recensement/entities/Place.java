package fr.diginamic.recensement.entities;

public class Place {
  private static final int CSV_REGION_CODE = 0;
  private static final int CSV_REGION_NAME = 1;
  private static final int CSV_DPT_CODE = 2;
  private static final int CSV_DISTRICT_CODE = 3;
  private static final int CSV_CANTON_CODE = 4;
  private static final int CSV_MUNICIPALITY_CODE = 5;
  private static final int CSV_MUNICIPALITY_NAME = 6;
  private static final int CSV_MUNICIPALITY_POPULATION = 7;
  private static final int CSV_APART_POPULATION = 8;
  private static final int CSV_TOTAL_POPULATION = 9;

  private String regionCode;
  private String regionName;
  private String dptCode;
  private String districtCode;
  private String cantonCode;
  private String municipalityCode;
  private String municipalityName;
  private int municipalityPopulation;
  private int apartPopulation;
  private int totalPopulation;

  public Place(String[] data) throws NumberFormatException {
    this(
        data[CSV_REGION_CODE],
        data[CSV_REGION_NAME],
        data[CSV_DPT_CODE],
        data[CSV_DISTRICT_CODE],
        data[CSV_CANTON_CODE],
        data[CSV_MUNICIPALITY_CODE],
        data[CSV_MUNICIPALITY_NAME],
        data[CSV_MUNICIPALITY_POPULATION],
        data[CSV_APART_POPULATION],
        data[CSV_TOTAL_POPULATION]);
  }

  private Place(String regionCode, String regionName, String dptCode, String districtCode, String cantonCode,
      String municipalityCode,
      String municipalityName, String municipalityPopulation, String apartPopulation, String totalPopulation) {
    this.regionCode = regionCode;
    this.regionName = regionName;
    this.dptCode = dptCode;
    this.districtCode = districtCode;
    this.cantonCode = cantonCode;
    this.municipalityCode = municipalityCode;
    this.municipalityName = municipalityName;
    this.municipalityPopulation = getIntFrom(municipalityPopulation);
    this.apartPopulation = getIntFrom(apartPopulation);
    this.totalPopulation = getIntFrom(totalPopulation);
  }

  private int getIntFrom(String nb) {
    return Integer.parseInt(nb.replaceAll(" ", ""));
  }

  public String getRegionCode() {
    return regionCode;
  }

  public String getRegionName() {
    return regionName;
  }

  public String getDptCode() {
    return dptCode;
  }

  public String getDistrictCode() {
    return districtCode;
  }

  public String getCantonCode() {
    return cantonCode;
  }

  public String getMunicipalityCode() {
    return municipalityCode;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getMunicipalityPopulation() {
    return municipalityPopulation;
  }

  public int getApartPopulation() {
    return apartPopulation;
  }

  public int getTotalPopulation() {
    return totalPopulation;
  }

}
