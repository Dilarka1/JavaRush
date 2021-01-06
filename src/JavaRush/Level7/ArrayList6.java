package JavaRush.Level7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6 {
    /*
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
•	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
•	Должна быть выведена только одна строка.
*/

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
            list.add(scanner.nextLine());

        int longWord = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > longWord)
                longWord = list.get(i).length();
        }

        int shortWord = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < shortWord)
                shortWord = list.get(i).length();
        }

        int index = 0;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).length() == shortWord ||
                    list.get(i).length() == longWord) {
                index = i;
                break;
            }
        System.out.println(list.get(index));
    }
}