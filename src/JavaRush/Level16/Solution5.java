package JavaRush.Level16;

/*
Продвижение на политических дебатах

1. Разберись, что делает программа.
2. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
3. Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока
не завершится всё свободное время.

Требования:
•	Вызови метод join у нужного объекта.
•	Метод toString класса политик Politician должен выводить сколько речей сказал политик,
 например: "Иванов сказал речь 35 раз".
•	Программа должна создавать 3 объекта типа Politician.
•	Методы, которые отвечают за вывод в консоль, не изменять.
•	Вывод программы должен свидетельствовать о том, что Иванов сказал больше всего речей
на политических дебатах.
*/

public class Solution5 {
    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Иванов");
        ivanov.join();
        Politician petrov = new Politician("Петров");

        Politician sidorov = new Politician("Сидоров");



        while (ivanov.getSpeechCount() + petrov.getSpeechCount() + sidorov.getSpeechCount() < totalSpeechCount) {

        }

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();


        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getSpeechCount());
        }
    }
}