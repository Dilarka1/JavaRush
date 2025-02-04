package JavaRush.Level6;

public class Solution1 {
    /*
    Минимальное число статиков

    Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.

Требования:
•	Реализацию и модификаторы доступа методов менять нельзя.
•	Добавь модификаторы static в нужные места.
•	В программе должно быть только 4 модификатора static.
•	Программа должна выводить текст на экран.
     */

    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new Solution1().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        main(null);
    }
}
