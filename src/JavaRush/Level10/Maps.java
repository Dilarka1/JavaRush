package JavaRush.Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    /*
Поправочки нужны

Наша программа демонстрирует работу HashMap: вводит с клавиатуры набор пар
 (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.
Нужно исправить программу так, чтобы она скомпилировалась.

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать три переменные.
•	Программа должна помещать в HashMap 10 пар (номер и строка), считанных с клавиатуры.
•	Программа должна выводить на экран содержимое HashMap. Каждое значение - с новой строки.
*/


    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Maps() {
        this.map = new HashMap<Integer, String>();
        map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Maps solution = new Maps();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <= 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
