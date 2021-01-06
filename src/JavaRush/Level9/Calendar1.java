package JavaRush.Level9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Calendar1 {
    /*
Какое сегодня число?

Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.

Требования:
•	Программа должна считывать данные с клавиатуры.
•	В программе должна быть объявлена переменная типа SimpleDateFormat.
•	В программе должна быть объявлена переменная типа Date.
•	Программа должна выводить данные на экран.
•	Вывод должен соответствовать заданию.
*/

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
           Scanner input = new Scanner(System.in);
         String data = input.nextLine();
        SimpleDateFormat dat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        d = dat1.parse(data);
        SimpleDateFormat data2 = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(data2.format(d).toUpperCase());

    }
}
