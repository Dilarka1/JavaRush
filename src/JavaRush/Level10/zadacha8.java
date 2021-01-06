package JavaRush.Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class zadacha8 {
  /*
Безопасное извлечение из списка

Создай список целых чисел и введи с клавиатуры 20 значений. Создай метод по безопасному
извлечению чисел из списка:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
Метод должен возвращать элемент списка (list) по его индексу (index). Если в процессе
 получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.

Требования:
•	Программа должна считывать 20 чисел с клавиатуры.
•	Программа должна выводить данные на экран.
•	Метод safeGetElement должен возвращать элемент списка по индексу, если исключений
внутри метода не возникло.
•	Метод safeGetElement должен возвращать defaultValue, если возникло исключений
 внутри метода. Исключение нужно перехватить.
•	Метод safeGetElement не должен бросать исключения.
*/

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 10, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        //напишите тут ваш код
        try {
            return list.get(index);
        } catch (IndexOutOfBoundsException e) {

        }
        return defaultValue;
    }
}