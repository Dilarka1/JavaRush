package JavaRush.Level7;


import java.util.ArrayList;
import java.util.Scanner;
/*
Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

Требования:
Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
Считай 5 строк с клавиатуры и добавь их в список.
Удали третий элемент списка.
Выведи элементы на экран, каждый с новой строки.
Порядок вывода должен быть обратный.
 */

public class List1 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            list.add(scanner.nextLine());
        }
        list.remove(2);

        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.println(list.get(j));
        }
    }
}
