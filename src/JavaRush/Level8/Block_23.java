package JavaRush.Level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Block_23 {
    /*
Только для богачей

Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
•	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

/*
Только для богачей
*/

    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Johnson", 5000);
        map.put("Smith", 5500);
        map.put("Chang", 450);
        map.put("Jonson", 5750);
        map.put("Sampson", 5000);
        map.put("Snider", 450);
        map.put("Chase", 450);
        map.put("Cooper", 5600);
        map.put("Morgan", 5500);
        map.put("Lui", 6600);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}