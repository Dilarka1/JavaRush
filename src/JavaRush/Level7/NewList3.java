package JavaRush.Level7;

import java.io.IOException;
import java.util.Scanner;

public class NewList3 {

    /*
Минимаксы в массивах

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
•	Создай массив целых чисел (int[]) на 20 элементов.
•	Считай с клавиатуры 20 целых чисел и добавь их в массив.
•	Найди и выведи через пробел максимальное и минимальное числа.
•	Используй цикл for.
*/
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scanner.nextInt();


        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > maximum)
                maximum = arr[i];
            else if (arr[i] < minimum)
                minimum = arr[i];


        System.out.print("Maximum i minimum :" + maximum + " " + minimum);
    }
}
