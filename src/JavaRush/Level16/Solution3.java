package JavaRush.Level16;

import java.util.ArrayList;
import java.util.List;

/*
Список и нити

В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым
 объектом класса Thread, работающим со своим объектом класса SpecialThread.

Требования:
•	В методе main создай 5 объектов типа SpecialThread.
•	В методе main создай 5 объектов типа Thread.
•	Добавь 5 разных нитей в список list.
•	Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
•	Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".
*/

public class Solution3 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread specialThread = new SpecialThread();
        Thread thread = new Thread();
        list.add(new Thread(specialThread));

        SpecialThread specialThread2 = new SpecialThread();
        Thread thread2 = new Thread();
        list.add(new Thread(specialThread2));

        SpecialThread specialThread3 = new SpecialThread();
        Thread thread3 = new Thread();
        list.add(new Thread(specialThread3));

        SpecialThread specialThread4 = new SpecialThread();
        Thread thread4 = new Thread();
        list.add(new Thread(specialThread4));

        SpecialThread specialThread5 = new SpecialThread();
        Thread thread5 = new Thread();
        list.add(new Thread(specialThread4));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
