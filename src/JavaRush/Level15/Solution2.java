package JavaRush.Level15;

/*
ООП - машинки

Оцени наши машины и определи их в подходящую категорию — роскошное или дешевое
авто — и выведи результат.
Для вывода используй только переменные из класса Constants.
В классе Ferrari реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу
ездить на Феррари".
В классе Lanos реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу
ездить на Ланосе".
Создай public static класс LuxuriousCar (РоскошнаяМашина).
Создай public static класс CheapCar (ДешеваяМашина).
Унаследуй Ferrari и Lanos от CheapCar и LuxuriousCar, подумай, какой класс для кого.
В классе LuxuriousCar реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу
ездить на роскошной машине".
В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу
ездить на дешевой машине".
В классах LuxuriousCar и CheapCar для метода printlnDesire расставь различными
способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось
расширение видимости.

Требования:
•	Класс Solution должен содержать public static класс LuxuriousCar.
•	Класс Solution должен содержать public static класс CheapCar.
•	Класс Ferrari должен быть потомком класса LuxuriousCar.
•	Класс Lanos должен быть потомком класса CheapCar.
•	Метод printlnDesire в классе LuxuriousCar должен выводить на экран фразу "Я хочу
ездить на роскошной машине".
•	Метод printlnDesire в классе CheapCar должен выводить на экран фразу "Я хочу
ездить на дешевой машине".
•	Метод printlnDesire в классе Ferrari должен выводить на экран фразу "Я хочу
ездить на Феррари".
•	Метод printlnDesire в классе Lanos должен выводить на экран фразу "Я хочу
ездить на Ланосе".
•	Область видимости методов printlnDesire в классах Ferrari и Lanos должна быть шире,
чем в их классах родителях.
*/

public class Solution2 {
    public static void main(String[] args) {
        new Solution2.LuxuriousCar().printlnDesire();
        new Solution2.CheapCar().printlnDesire();
        new Solution2.Ferrari().printlnDesire();
        new Solution2.Lanos().printlnDesire();
    }

    public static class LuxuriousCar{
        private void printlnDesire(){
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }

    }

    public static class CheapCar{
        private void printlnDesire(){
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }

    }

    public static class Ferrari extends LuxuriousCar{
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar{
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
            //add your code here
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}