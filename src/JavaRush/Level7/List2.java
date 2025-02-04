package JavaRush.Level7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
/*
Играем в Jолушку


1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
 потом тот, который для x%2, потом последний.

Требования:
•	Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел).
Первый список будет главным, а остальные - дополнительными.
•	Считать 20 чисел с клавиатуры и добавить их в главный список.
•	Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
•	Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
•	Добавить в третий дополнительный список все остальные числа из главного.
•	Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
•	Программа должна вывести три дополнительных списка, используя метод printList.
*/

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0)
                list1.add(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                list2.add(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0)
                list3.add(list.get(i));
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}