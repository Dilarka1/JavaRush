package JavaRush.Level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ЧислаПоВозрастанию {
    /*
Числа по возрастанию

Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

Требования:
•	Программа должна считывать 5 чисел с клавиатуры.
•	Программа должна выводить 5 чисел, каждое с новой строки.
•	Выведенные числа должны быть отсортированы по возрастанию.
•	Вывод должен содержать те же числа, что и были введены (порядок не важен).
*/

    public static void main(String[] args) throws Exception {
        //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int num4 = scanner.nextInt();
//        int num5 = scanner.nextInt();
//
//        int [] arr = {num1, num2, num3, num4, num5};
//

        int[] arr = new int[5];

        //заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        SortArray(arr);
    }

        //напишите тут ваш код

        public static void SortArray ( int[] arr){
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }