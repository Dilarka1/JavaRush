package JavaRush.Level8;

import java.util.*;

public class Block_213 {
    /*
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
String состоящих из 10 записей.
•	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
•	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/


    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Jonson", "John");
        map.put("Trump", "Donald");
        map.put("Mouse", "Mickey");
        map.put("Duck", "Donald");
        map.put("Jessica", "Simpson");
        map.put("Montana", "Hanna");
        map.put("Bill", "Gates");
        map.put("Biber", "Jastin");
        map.put("Pan", "Peter");
        map.put("Skywalker", "Luke");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + "-" + value);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        HashMap<String, String> test = new HashMap<>(map);
        List<String> list = new ArrayList<>();

        Iterator<Map.Entry<String, String>> iterator = test.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            String key = pair.getKey();

            Iterator<Map.Entry<String, String>> iterator2 = test.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<String, String> pair2 = iterator2.next();
                String value2 = pair2.getValue();
                String key2 = pair2.getKey();
                if (value2.equals(value) && !key2.equals(key))
                    list.add(value2);
            }
        }
        for (String s : list) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void main(String[] args) {

    }
}
