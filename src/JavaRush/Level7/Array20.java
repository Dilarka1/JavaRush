package JavaRush.Level7;

import java.io.IOException;
import java.util.Scanner;

public class Array20 {
/*
Массивный максимум

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива

Требования:
•	Метод initializeArray должен создавать массив из 20 целых чисел.
•	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
•	Метод max должен возвращать максимальный элемент из переданного массива.
•	Метод main изменять нельзя.
*/

    public static void main(String[] args) throws Exception {
        int[] arr = initializeArray();
        int max = max(arr);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[20];

        for(int i = 0; i < arr.length; i ++)
            arr [i] = scanner.nextInt();
        return arr;
    }

    public static int max(int[] arr) {
        // найди максимальное значение
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] > max)
                max = arr[i];
        return max;
    }
}
