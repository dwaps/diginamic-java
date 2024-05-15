package fr.diginamic.dates;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date date = calendar.getTime();
    System.out.println(sdf.format(date));

    sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    System.out.println("Date du jour : " + sdf.format(date));

    SimpleDateFormat sdfFrench = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", Locale.FRENCH);
    System.out.println("Date en français : " + sdfFrench.format(date));

    DateFormatSymbols russianSymbols = new DateFormatSymbols(new Locale("ru", "RU"));
    sdf.setDateFormatSymbols(russianSymbols);
    System.out.println("Date en russe : " + sdf.format(date));

    SimpleDateFormat sdfChinese = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss", Locale.CHINESE);
    System.out.println("Date en chinois : " + sdfChinese.format(date));

    SimpleDateFormat sdfGerman = new SimpleDateFormat("dd. MMMM yyyy HH:mm:ss", Locale.GERMAN);
    System.out.println("Date en allemand : " + sdfGerman.format(date));
  }
}

record Person(String name) {
}
