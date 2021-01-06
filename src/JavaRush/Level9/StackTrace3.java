package JavaRush.Level9;

public class StackTrace3 {
    /*
Стек-трейс длиной 10 вызовов

Напиши код, чтобы получить стек-трейс длиной 10 вызовов. Метод main изменять нельзя.

Требования:
•	В классе должно быть 10 методов (метод main не учитывать).
•	В переменной stackTraceLength должно получиться значение 10.
•	Каждый метод должен вызывать другой метод.
•	Используй метод Thread.currentThread().getStackTrace().
}

*/

    public static void main(String[] args) {
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return method3();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return method4();
    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return method5();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return method6();
    }

    public static StackTraceElement[] method6() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return method7();
    }

    public static StackTraceElement[] method7() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return method8();
    }

    public static StackTraceElement[] method8() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return method9();
        }

        public static StackTraceElement[] method9 () {
            return method10();
        }

        public static StackTraceElement[] method10 () {
            return Thread.currentThread().getStackTrace();
        }
    }
