package JavaRush.Level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Статики-2

В этой задаче тебе нужно:
В статическом блоке считать с консоли А и В — две переменные с типом int.
Обработать IOException в блоке catch.
Закрыть поток ввода методом close().

Требования:
•	Поле A должно быть публичным и статическим.
•	Поле B должно быть публичным и статическим.
•	Программа должна считывать данные с клавиатуры в статическом блоке.
•	Программа должна инициализировать поля A и B в статическом блоке согласно введенным с
клавиатуры значениям.
•	Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.

*/

public class Solution8 {
    public static int A;
    public static int B;


    static {
        try {
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));

            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}