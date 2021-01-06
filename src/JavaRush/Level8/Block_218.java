package JavaRush.Level8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Block_218 {

    /*
Работа с датой

1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество
 дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать два метода.
•	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
•	Метод main() должен вызывать метод isDateOdd().
*/

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
