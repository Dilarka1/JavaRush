package JavaRush.Level10;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution6 {
    /*
Массив списков строк

Создай массив, элементами которого будут списки строк.
Заполни массив любыми данными и выведи их на экран.

Требования:
•	Метод createList должен объявлять и инициализировать массив с типом
элементов ArrayList<String>.
•	Метод createList должен возвращать созданный массив.
•	Метод createList должен добавлять в массив элементы (списки строк).
Списки должны быть не пустые.
•	Программа должна выводить данные на экран.
•	Метод main должен вызывать метод createList.
•	Метод main должен вызывать метод printList.
*/
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] array = new ArrayList[4];
        for (int i = 0; i < array.length; i++) {

            array[i] = new ArrayList<String>();
            array[i].add("sun");
            array[i].add("rain");
            array[i].add("snow");
        }
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
