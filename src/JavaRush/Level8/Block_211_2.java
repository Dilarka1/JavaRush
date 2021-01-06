package JavaRush.Level8;

import java.util.HashMap;
import java.util.Map;

public class Block_211_2 {
    public static void main(String[] args) {
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
    }
}