package JavaRush.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NewList8 {

    /*
В убывающем порядке

Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

Требования:
•	Программа должна считывать 20 целых чисел с клавиатуры.
•	Программа должна выводить 20 чисел.
•	В классе Solution должен быть метод public static void sort(int[] array).
•	Метод main должен вызывать метод sort.
•	Метод sort должен сортировать переданный массив по убыванию.
*/


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

            for (int x : array) {
                System.out.println(x);
            }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код

      //  Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            //   System.out.println(array[i]);
        }
    }
}