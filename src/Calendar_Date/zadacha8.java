package Calendar_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class zadacha8 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        String dateLowerCase = date.toLowerCase();
        String dateCorrect = dateLowerCase.substring(0, 1).toUpperCase() + dateLowerCase.substring(1);

        LocalDate parsedDate = LocalDate.parse(dateCorrect, DateTimeFormatter.ofPattern("MMMM d yyyy"));

        int todayIsDay = parsedDate.getDayOfYear();

        boolean flag = false;
        if (todayIsDay % 2 != 0) {
            flag = true;
        }
        return flag;
    }
}




        //        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM.d.yyyy");//FEBRUARY 1 2013
//        String date = "MAY 1 2013";
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(dateFormat.parse(date));

//        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(dateFormat.parse(date));
