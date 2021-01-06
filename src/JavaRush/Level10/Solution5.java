package JavaRush.Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution5 {
    /*
Одинаковые слова в списке

Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается
в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый
 параметр - уникальное слово, а второй - число раз, сколько раз данное слово
 встречалось в списке.

Выведи содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.

Требования:
•	Метод countWords должен объявлять и инициализировать HashMap с типом
элементов <String, Integer>.
•	Метод countWords должен возвращать созданный словарь.
•	Метод countWords должен добавлять в словарь ключи, соответствующие уникальным
словам, и значения по этим ключам, отображающие, сколько раз встречалось слово.
•	Программа должна выводить на экран полученный словарь.
•	Метод main должен вызывать метод countWords.

*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            result.put(list.get(i), count);
        }
        return result;
    }
}