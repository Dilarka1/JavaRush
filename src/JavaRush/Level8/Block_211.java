package JavaRush.Level8;

import java.util.HashMap;
import java.util.Map;

public class Block_211 {
    /*
Перепись населения

Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
String состоящих из 10 записей по принципу «Фамилия» - «Имя».
•	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
•	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.

*/

    public static Map<String, String> createMap() {
        //напишите тут ваш код

        Map<String, String> map = new HashMap<>();
        map.put("Simpson", "John");
        map.put("Trump", "Donald");
        map.put("Mouse", "Mickey");
        map.put("Duck", "Donald");
        map.put("Biber", "Jastin");
        map.put("Simpson", "Jessica");
        map.put("Montana", "Hanna");
        map.put("Pavlova", "Anna");
        map.put("Gates", "Bill");
        map.put("Brin", "Sergey");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + "-" + value);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(map.size());
        System.out.println(getCountTheSameFirstName(createMap(), "Donald"));
        System.out.println(getCountTheSameFirstName(createMap(), "Simpson"));
    }
}