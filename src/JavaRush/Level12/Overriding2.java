package JavaRush.Level12;

public class Overriding2 {
    /*
    Int и Integer

    Реализуй два метода: print(int) и print(Integer).
    Напиши такой код в методе main(), чтобы вызвались оба.

    Требования:
    Класс Solution должен содержать статический метод main().
    Класс Solution должен содержать статический void метод print() с параметром типа int.
    Класс Solution должен содержать статический void метод print() с параметром типа Integer.
    Метод main() должен вызывать метод print() с параметром типа int.
    Метод main() должен вызывать метод print() с параметром типа Integer.
    */
    public static void main(String[] args) {
        Overriding2.print(new Integer(7));
        Overriding2.print(9);

    }

    //Напишите тут ваши методы
    public static void print(int a) {

    }

    public static void print(Integer b) {

    }
}