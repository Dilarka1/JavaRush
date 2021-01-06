package JavaRush.Level14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution12 {
    /*
Нашествие исключений

Заполни список exceptions десятью различными исключениями.
Первое исключение уже реализовано в методе initExceptions.

Требования:
•	Список exceptions должен содержать 10 элементов.
•	Все элементы списка exceptions должны быть исключениями (потомками класса Throwable).
•	Все элементы списка exceptions должны быть уникальны.
•	Метод initExceptions должен быть статическим.
*/


    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            boolean a = (8 >= 9);
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            String b = "123";
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            int[] arr = {1, 2, 3, 5};
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int[] arr5 = {1, 2, 3, 4, 5};
        } catch (RuntimeException e) {
            exceptions.add(e);
        }

        try {
            double b = 25.25 + 0.25;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        try {
            String[] arr2 = {"a", "b", "c"};
            arr2[3] = "v";
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        exceptions.add(new ArrayStoreException());
        exceptions.add(new ClassCastException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new InterruptedException());
        exceptions.add(new InstantiationException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new ArrayIndexOutOfBoundsException());


        // exceptions.add(new ArrayStoreException());
        // exceptions.add(new ClassCastException());
        // exceptions.add(new NoSuchFieldException());
        // exceptions.add(new NoSuchMethodException());
        // exceptions.add(new NoSuchFieldException());
        // exceptions.add(new IllegalAccessException());
        // exceptions.add(new ClassNotFoundException());
        // exceptions.add(new InterruptedException());
        // exceptions.add(new InstantiationException());


        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new IllegalStateException());
        exceptions.add(new ClassCastException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new StringIndexOutOfBoundsException());

    }
}