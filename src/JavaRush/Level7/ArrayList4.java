package JavaRush.Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
    /*
Выражаемся покороче

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
•	Программа должна выводить самую короткую строку на экран.
•	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }

        int shortWord = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i).length() < shortWord) {
                shortWord = list.get(i).length();
            }
        }
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).length() == shortWord) {
                System.out.println(list.get(j));
            }
        }
    }
}
