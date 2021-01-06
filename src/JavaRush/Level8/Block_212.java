package JavaRush.Level8;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Block_212 {

    /*
Добрая Зинаида и летние каникулы

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
Date состоящий из 10 записей.
•	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/


    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Biber", dateFormat.parse("June 24 1999"));
        map.put("Jackson", dateFormat.parse("April 3 1987"));
        map.put("Simspon", dateFormat.parse("July 4 2000"));
        map.put("Kashkin", dateFormat.parse("October 20 1990"));
        map.put("Sushkin", dateFormat.parse("December 16 2004"));
        map.put("Plyushkin", dateFormat.parse("August 25 1999"));
        map.put("Jonson", dateFormat.parse("November 26 2003"));
        map.put("Stewart", dateFormat.parse("January 1 1980"));
        map.put("Sampton", dateFormat.parse("June 1 1998"));
        map.put("Toyota", dateFormat.parse("April 29 2007"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String date = iterator.next().getValue().toString();
            if (date.contains("Aug") ||
                    date.contains("Jun") ||
                    date.contains("Jul")) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
    }
}
