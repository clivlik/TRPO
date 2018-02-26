package lab1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws ParseException {

        String text = "2018-02-18T01:02:03Z";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = (Date) df.parse(text);
        GregorianCalendar cal = new GregorianCalendar();

        cal.setFirstDayOfWeek(GregorianCalendar.MONDAY);
        cal.setTime(date);

        System.out.println("Current date: " + cal.getTime());

        cal.set(GregorianCalendar.HOUR_OF_DAY, 0);
        cal.clear(GregorianCalendar.MINUTE);
        cal.clear(GregorianCalendar.SECOND);
        cal.clear(GregorianCalendar.MILLISECOND);

        cal.add(GregorianCalendar.DAY_OF_MONTH,1);
        System.out.println("Start of next day: " + cal.getTime());

        cal.setTime(date);
        cal.set(GregorianCalendar.HOUR_OF_DAY, 0);
        cal.clear(GregorianCalendar.MINUTE);
        cal.clear(GregorianCalendar.SECOND);
        cal.clear(GregorianCalendar.MILLISECOND);

        cal.set(GregorianCalendar.DAY_OF_WEEK, df.getCalendar().getFirstDayOfWeek());
        System.out.println("Start of this week: " + cal.getTime());

        cal.add(GregorianCalendar.WEEK_OF_YEAR, 1);
        System.out.println("Start of the next week: " + cal.getTime());

        cal.set(GregorianCalendar.DAY_OF_MONTH, df.getCalendar().getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("End of the month: " + cal.getTime());

    }
}