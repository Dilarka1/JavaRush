package JavaRush.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class NewList4 {

    /*
Это конец

Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
•	Саму строку "end" не нужно добавлять в список.
•	Выведи список на экран, каждое значение с новой строки.
•	Используй цикл for.
*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String end = "";
        while (true) {
            end=scanner.nextLine();
            if (end.equals("end")) {
                break;
            }else{
                list.add(end);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
