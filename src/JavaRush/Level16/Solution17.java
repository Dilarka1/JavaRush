package JavaRush.Level16;

/*
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция

1. В методе run после всех действий поставь задержку в 10 миллисекунд. Выведи
"Нить прервана", если нить будет прервана.
2. Сделай так, чтобы все нити выполнялись последовательно: сначала для нити №1
отсчет с COUNT до 1, потом для нити №2 с COUNT до 1 и т.д.

Пример:
#1: 4
#1: 3
...
#1: 1
#2: 4
...

Требования:
•	Программа должна создавать 4 объекта типа SleepingThread.
•	Метод main должен вызвать join у каждой создаваемой SleepingThread нити.
•	Метод run должен использовать Thread.sleep(10).
•	Вывод программы должен соответствовать условию.
•	Если нить SleepingThread прерывается, она должна вывести сообщение "Нить прервана".
*/

public class Solution17 {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();

            //напишите тут ваш код
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //напишите тут ваш код
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("Нить прервана");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
