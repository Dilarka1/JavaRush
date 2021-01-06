package JavaRush.Level15;

/*
Значения по умолчанию

В этой задаче тебе нужно:
Создать 7 public полей класса:
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
Убедиться, что они инициализируются дефолтными значениями.
Вывести их значения в заданном порядке в методе main()

Требования:
•	В классе Solution должно быть объявлено поле intVar типа int.
•	В классе Solution должно быть объявлено поле doubleVar типа double.
•	В классе Solution должно быть объявлено поле DoubleVar типа Double.
•	В классе Solution должно быть объявлено поле booleanVar типа boolean.
•	В классе Solution должно быть объявлено поле ObjectVar типа Object.
•	В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
•	В классе Solution должно быть объявлено поле StringVar типа String.
•	Метод main должен выводить значения полей на экран (каждое — с новой строки или
через пробел) в заданном порядке. Инициализировать переменные не нужно.
*/

public class Solution9 {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.intVar);
        System.out.println(solution9.doubleVar);
        System.out.println(solution9.DoubleVar);
        System.out.println(solution9.booleanVar);
        System.out.println(solution9.ObjectVar);
        System.out.println(solution9.ExceptionVar);
        System.out.println(solution9.StringVar);
    }
}