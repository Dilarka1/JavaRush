package JavaRush.Level13;

public class Solution16 {
    /*
Четыре ошибки

Исправь 4 ошибки в программе, чтобы она компилировалась.

Требования:
•	У переменных, объявленных в интерфейсе, может быть только самый
широкий уровень доступа (public).
•	Унаследоваться (extends) можно только от класса: для реализации интерфейсов
 используется ключевое слово implements.
•	Класс Hobby должен быть объявлен с модификатором доступа static.
•	Для доступа к переменной HOBBY не нужно создавать объект Dream.
•	Объявления интерфейсов не изменяй.
*/
    public static void main(String[] args) {
        Hobby hobby = new Hobby();
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    public static class Hobby implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}