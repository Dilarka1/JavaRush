package JavaRush.Level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Разные методы для разных типов

В этой задаче тебе нужно:
Считывать с консоли данные, пока не будет введено слово "exit".
Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
содержит точку '.', вызвать метод print() для Double;
больше нуля, но меньше 128, вызвать метод print() для short;
меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
иначе — вызвать метод print() для String.

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна прекращать считывать данные с клавиатуры после того, как введена строка "exit".
•	Если введенная строка содержит точку("."), и ее можно корректно преобразовать в число типа
 Double - должен быть вызван метод print(Double value).
•	Если введенная строка может быть корректно преобразована в число типа short и полученное
число больше 0, но меньше 128 - должен быть вызван метод print(short value).
•	Если введенная строка может быть корректно преобразована в число типа Integer и полученное
число меньше или равно 0 или больше или равно 128 - должен быть вызван метод print(Integer value).
•	Во всех остальных случаях должен быть вызван метод print(String value).
*/

public class Solution20 {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while (true) {
            str = reader.readLine();
            if (str.equals("exit")) {
                break;
            }
            try {
                if (str.contains(Character.toString('.'))) {
                    print(Double.parseDouble(str));
                    continue;
                }
                if (Short.parseShort(str) > 0 && Short.parseShort(str) < 128) {
                    print(Short.parseShort(str));
                    continue;
                }
                if (Integer.parseInt(str) >= 128 || (Integer.parseInt(str) <= 0)) {
                    print(Integer.parseInt(str));
                    continue;
                }
            } catch (Exception e) {
                print(str);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
