package JavaRush.Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI_zadacha {

    /*
Контролируем массу тела

Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить н
а экран сообщение о индексе массы тела.
Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5 (не включая),
"Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25 (не включая),
"Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 30 (не включая),
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 25


Требования:
•	Метод calculateMassIndex должен выводить текст на экран.
•	Метод calculateMassIndex должен выводить "Недовес: меньше чем 18.5" на экран, если индекс массы тела меньше 18.5 (не включая).
•	Метод calculateMassIndex должен выводить "Нормальный: между 18.5 и 25" на экран, если индекс массы тела между 18.5 и 25 (не включая).
•	Метод calculateMassIndex должен выводить "Избыточный вес: между 25 и 30" на экран, если индекс массы тела между 25 и 30 (не включая).
•	Метод calculateMassIndex должен выводить "Ожирение: 30 или больше" на экран, если индекс массы тела 30 или больше.

*/

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {

        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double bmi = weight / (height * height);

            if (bmi <= 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (bmi < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            } else if (bmi < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            } else {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}