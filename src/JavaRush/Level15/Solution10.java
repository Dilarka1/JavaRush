package JavaRush.Level15;

/*
Статики и исключения

В статическом блоке выбрось Exception.
Нужно, чтобы класс не загрузился, и вместо значения переменной B появилось сообщение об ошибке:
Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement

Требования:
•	В классе Solution в статическом блоке должно возникать исключение (Exception).
•	Программа не должна ничего выводить на экран, кроме автоматического сообщения о возникшем исключении.
•	Программа не должна считывать данные с клавиатуры.
•	Класс Solution должен быть public.
*/

public class Solution10 {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        int i = 1/0;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
