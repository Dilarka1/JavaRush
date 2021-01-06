package JavaRush.Level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Block_26 {

    /*
Задача по алгоритмам

Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать три метода.
•	Метод main() должен вызывать метод sort().
•	Метод sort() должен вызывать метод isGreaterThan().
•	Выведенные слова должны быть отсортированы в алфавитном порядке.
*/

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine(); //reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        isGreaterThan("a","b");
        Arrays.sort(array);

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}