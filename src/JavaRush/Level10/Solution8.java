package JavaRush.Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution8 {
    /*
Функциональности маловато!

Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку)
и сохраняла их в HashMap.

Ключевые требования:
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить текст на экран.
•	В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
•	Программа должна помещать в HashMap пары считанные с клавиатуры.
•	Программа должна выводить на экран содержимое HashMap согласно условию.
Ключ и значение разделены пробелом. Каждое значение с новой строки.
*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String idi = reader.readLine();
            if (idi == null) break;
            String name = reader.readLine();
            if (name == null) break;
            int id = Integer.parseInt(idi);
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String name = pair.getKey();
            int id = pair.getValue();
            System.out.println(id + " " + name);
        }
    }
}