package JavaRush.Level7;

import java.util.Arrays;
import java.util.Scanner;

public class zadacha {

    /*
Переверни массив

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна выводить 10 строчек, каждую с новой строки.
•	Массив должен быть выведен на экран в обратном порядке.
*/


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];

        for(int i = 0; i < 10; i ++)
            arr[i] = scanner.nextInt();


       // Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i-- ){
            System.out.println(arr[i]);
        }
    }
}
