package JavaRush.Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {

    /*
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
•	Программа должна выводить самую длинную строку на экран.
•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        int longWord = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > longWord) {
                longWord = strings.get(i).length();
            }
        }
        for (int j = 0; j < strings.size(); j++) {
            if (strings.get(j).length() == longWord) {
                System.out.println(strings.get(j));
            }
        }
    }
}