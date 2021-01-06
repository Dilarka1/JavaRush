package JavaRush.Level7;

import java.util.Scanner;

public class reverceArray {

    /*
Массив из строчек в обратном порядке

1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна считывать 8 строк для массива с клавиатуры.
•	Программа должна выводить на экран 10 строк, каждую с новой строки.
•	Программа должна выводить на экран массив (10 элементов) в обратном порядке.
*/
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            Scanner scanner = new Scanner(System.in);
            String [] arr = new String [10];

            for(int i = 0; i < 8; i++)
                arr[i] = scanner.nextLine();

            for(int i = arr.length-1; i >= 0; i-- )
                System.out.println(arr[i]);

        }
    }
