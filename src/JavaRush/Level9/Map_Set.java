package JavaRush.Level9;

import java.util.*;

public class Map_Set {

    /*
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод createMap должен создавать новый объект HashMap<String, Cat>.
•	Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
•	Метод createMap должен возвращать созданный словарь.
•	Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
•	Программа должна вывести всех котов из множества на экран.
*/

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat>map = new HashMap<>();
        map.put("Murka", new Cat("1"));
        map.put("Kisa", new Cat("2"));
        map.put("Barsik", new Cat("3"));
        map.put("Marusya", new Cat("4"));
        map.put("Vaska", new Cat("5"));
        map.put("Tuzik", new Cat("6"));
        map.put("Kotya", new Cat("7"));
        map.put("Mosik", new Cat("8"));
        map.put("Koshka", new Cat("9"));
        map.put("Kiska", new Cat("10"));

        /*
        for (int i = 0; i< 10; i++){
            Cat cat = new Cat("cats name" + (i + 1));
            String s = "cat" + (i+1);
            map.put(s,cat);
         */

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat>set = new HashSet<Cat>();
//        for(int i = 0; i <10; i ++){
//            set.add(map.get("cat" + (i+1)));
//        }
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
