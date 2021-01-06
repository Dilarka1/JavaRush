package JavaRush.Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {
    /*
Удалить и вставить

1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры.
•	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
•	Программа должна выводить список на экран, каждое значение с новой строки.
*/

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        for (int j = 0; j < 13; j++) {

            list.add(0, list.remove(4));
        }
        for (String viva : list)
            System.out.println(viva);
    }
}
