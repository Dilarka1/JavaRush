package JavaRush.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class NewList1 {
    /*
Перестановочка подоспела

Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
•	Переставить M первых строк в конец списка.
•	Выведи список на экран, каждое значение с новой строки.
*/

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        //напишите тут ваш код
//        ArrayList<String> list = new ArrayList<>();
//        int N = Integer.parseInt(reader.readLine());
//        int M = Integer.parseInt(reader.readLine());

//        for (int i = 0; i <= N; i++)
//            list.add(scanner.nextLine());
//        for (int i = 0; i <= M; i++)
//            list.add(list.remove(0));
//        list.forEach(System.out::println);
//    }
//}


//        for (int i = 0; i <= N; i++) {
//            list.add(scanner.nextLine());
//            System.out.println(list);
//        }
//            for (int i = 0; i < M; i++) {
//                list.add(list.remove(0));
//                System.out.println(list);
//            }
//        }
//    }

        /*  правильный вариант
         */
        public static void main (String[]args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //напишите тут ваш код
            ArrayList<String> list = new ArrayList<>();
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) list.add(reader.readLine());
            for (int i = 0; i < m; i++) list.add(list.remove(0));
           // list.forEach(System.out::println);
for(int i = 0; i < list.size(); i++)
    System.out.println(list.get(i));
        }
    }

