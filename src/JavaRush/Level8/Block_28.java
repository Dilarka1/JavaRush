package JavaRush.Level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Block_28 {
    /*
Пять победителей

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.

Требования:
•	Программа должна выводить числа на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать два метода.
•	Метод sort() должен сортировать массив чисел от большего к меньшему.
•	Метод main() должен вызывать метод sort().
•	Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.
*/


    public static void main(String[] args) throws Exception {
        //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();      //Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
