package JavaRush.Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution7 {
    /*
Количество букв

Введи с клавиатуры 10 строчек и посчитай в них количество различных букв
без учета регистра. Результат выведи на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9

Требования:
•	Программа должна 10 раз считывать данные с клавиатуры.
•	Программа должна выводить текст на экран.
•	Выведенный текст должен содержать 33 строки.
•	Каждая строка вывода должна содержать букву русского алфавита,
пробел и количество раз, которое буква встречалась в введенных строках.
*/

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            for (int j = 0; j < s.length(); j++) {
                Character ch = s.charAt(j);
                for(Map.Entry e : map.entrySet()) {
                    Character mh =(Character) e.getKey();
                    if (mh.equals(ch)) {
                        Integer is = (Integer)e.getValue();
                        is = is + 1;
                        e.setValue(is);

                    }
                }
            }
        }
        for (Map.Entry<Character, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
