package JavaRush.Level15.Solution11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Осваивание статического блока

В этой задаче тебе нужно:
Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
В статическом методе reset() класса Solution:
считать с консоли параметр типа String;
если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter;
если параметр равен "plane", считать второй параметр типа int (количество пассажиров),
 статическому объекту CanFly result присвоить объект класса Plane.
В статическом блоке инициализировать CanFly result, вызвав метод reset().
Закрыть поток ввода методом close().

Требования:
•	Класс Plane должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
•	Класс Helicopter должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
•	Класс Plane должен иметь конструктор с параметром int.
•	В классе Solution должен быть реализован метод public static void reset().
•	Метод reset() должен считывать строки с клавиатуры.
•	Если введенная строка равна "helicopter", в переменную result должен быть сохранен объект
типа Helicopter.
•	Если введенная строка равна "plane", в переменную result должен быть сохранен объект типа Plane.
•	Поле result класса Solution должно быть инициализировано в статическом блоке путем вызова
метода reset().
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут

        reset();
    }


    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String col = bufferedReader.readLine();
            if (col.equals("helicopter")) result = new Helicopter();
            if (col.equals("plane")) result = new Plane(55);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
