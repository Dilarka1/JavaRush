package JavaRush.Level7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewList6 {

    /*
Проверка на упорядоченность

1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента,
нарушающего такую упорядоченность.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай 10 строк с клавиатуры и добавь их в список.
•	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
•	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран
индекс первого элемента, нарушающего такую упорядоченность.
*/

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > list.get(i + 1).length()){
                System.out.println(i+1);
                break;
            }
        }
    }
}