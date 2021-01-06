package JavaRush.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Block_210 {
    /*
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
•	Программа должна считывать одно значение с клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна использовать коллекции.
•	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("January", " is the 1 month");
        map.put("February", " is the 2 month");
        map.put("March", " is the 3 month");
        map.put("April", " is the 4 month");
        map.put("May", " is the 5 month");
        map.put("June", " is the 6 month");
        map.put("July", " is the 7 month");
        map.put("August", " is the 8 month");
        map.put("September", " is the 9 month");
        map.put("October", " is the 10 month");
        map.put("November", " is the 11 month");
        map.put("December", " is the 12 month");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String month = r.readLine();
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (month.equals(key)) {

                System.out.println(key + value);
            }
        }
    }
}