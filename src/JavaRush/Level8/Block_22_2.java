package JavaRush.Level8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Block_22_2 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Василов", 200);
        map.put("Василова", 600);
        map.put("Дьиченко", 200);
        map.put("Михайлов", 700);
        map.put("Синченко", 600);
        map.put("Зимницкий", 20000);
        map.put("Мелешко", -1000);
        map.put("Кашин", 200);
        map.put("Усачёв", 200);
        map.put("Сумчатов", 900);
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
