package JavaRush.Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {

    /*
Удваиваем слова

1. Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

3. Выведи результат на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай 10 строк с клавиатуры и добавь их в список.
•	Метод doubleValues должен удваивать элементы списка по принципу
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
•	Выведи получившийся список на экран, каждый элемент с новой строки.
*/

    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        System.out.println(result);
        for(int i = 0; i < result.size(); i++)
        System.out.println(result.get(i));
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for( int i = 0; i <list.size(); i++){
            list.add(i +1, list.get(i));
            i++;
            }
        return list;
    }
}