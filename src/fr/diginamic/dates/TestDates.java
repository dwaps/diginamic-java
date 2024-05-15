package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
  public static void main(String[] args) {
    Date now = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Date du jour : " + sdf.format(now));

    Calendar calendar = Calendar.getInstance();
    calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);
    Date dateWithTime = calendar.getTime();
    System.out.println("Date au format a/m/j h:m:s : " + dateWithTime);

    Date current = new Date(System.currentTimeMillis());
    sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    System.out.println("Date système : " + sdf.format(current));
  }
}