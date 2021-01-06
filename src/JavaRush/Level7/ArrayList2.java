package JavaRush.Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

    /*
В начало списка

1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна добавлять строки в начало списка.
•	Программа должна выводить список на экран, каждое значение с новой строки.
*/

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            // String word = scanner.nextLine();
            //  list.add(0, word);
            list.add(0, scanner.nextLine());
        }

        for (int j = 0; j < list.size(); j++) {

            System.out.println(list.get(j));
        }
    }
}
