package JavaRush.Level8;

import java.util.HashMap;
import java.util.Map;

public class Block_24 {

    /*
Однофамильцы и тёзки

1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.

Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать только три метода.
•	Метод createPeopleMap() должен создавать и возвращать словарь Map с типом элементов String, String.
Кроме того, добавлять в словарь 10 человек.
•	В методе createPeopleMap() должны добавляться люди с одинаковыми фамилиями.
•	В методе createPeopleMap() должны добавляться люди с одинаковыми именами.
•	Метод printPeopleMap() должен выводить на экран всех людей из словаря Map.
 Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
•	Метод main() должен вызывать метод createPeopleMap().
•	Метод main() должен вызывать метод printPeopleMap().

*/


    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("John", "Jonson");
        map.put("Sam", "Smith");
        map.put("Rachel", "Smith");
        map.put("Anna", "Smith");
        map.put("Anna", "Pavlova");
        map.put("Alice", "Anderson");
        map.put("Sandra", "Bullock");
        map.put("Sandra", "Anderson");
        map.put("Donald", "Trump");
        map.put("Donald", "Duck");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
