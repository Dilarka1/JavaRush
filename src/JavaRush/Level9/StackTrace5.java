package JavaRush.Level9;

public class StackTrace5 {

    /*
Там, в синих глубинах стек-трейса…

Написать метод, который возвращает результат - глубину его стек-трейса - количество методов
в нем (количество элементов в списке).
Это же число метод должен выводить на экран.

Требования:
•	Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
•	Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
•	Воспользуйся методом Thread.currentThread().getStackTrace().
•	Метод main должен вызывать метод getStackTraceDepth.
*/

    public static void main(String[] args) {
        int deep = getStackTraceDepth();
        System.out.println(deep);
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        int length = element.length;
        System.out.println(length);

        return length;
    }
}
