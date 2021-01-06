package Calendar_Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class zadacha7 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar = new GregorianCalendar(1979, Calendar.MARCH, 28);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        calendar.roll(Calendar.YEAR, +40);
        System.out.println(dateFormat.format(calendar.getTime()));


        String date = "MAY 16 2020";
        String dateLowerCase = date.toLowerCase();
        String dateCorrect = dateLowerCase.substring(0, 1).toUpperCase() + dateLowerCase.substring(1);

        LocalDate parsedDate = LocalDate.parse(dateCorrect, DateTimeFormatter.ofPattern("MMMM d yyyy"));

        int todayIsDay = parsedDate.getDayOfYear();
        System.out.println(todayIsDay);

    }
}
