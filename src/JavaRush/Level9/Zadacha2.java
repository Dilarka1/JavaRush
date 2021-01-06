package JavaRush.Level9;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha2 {
    /*
Метод в try..catch

Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Метод main не изменять.
•	Метод main не должен кидать исключений.
•	Метод readData должен содержать блок try..catch.
•	Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.
*/
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            try {
                list.add(input.nextInt());

            } catch (Exception e) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
                break;
            }
        }
    }
}