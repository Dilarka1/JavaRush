package JavaRush.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Block_216 {

    /*
Омовение Рамы

Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать строку с клавиатуры.
•	Класс Solution должен содержать один метод.
•	Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

    public static void main(String[] args) throws IOException {
        //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        //   String string = reader.readLine();
        String one = scanner.nextLine();
        //напишите тут ваш код
        String two = "";
        two = two + one.substring(0, 1).toUpperCase();
        for (int i = 1; i < one.length(); i++) {

            if (" ".equals(one.substring(i - 1, i))) {
                two = two + one.substring(i, i + 1).toUpperCase();
            } else
                two = two + one.substring(i, i + 1);
            }
        System.out.println(two);
    }
}