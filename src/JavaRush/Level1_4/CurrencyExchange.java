package JavaRush.Level1_4;

public class CurrencyExchange {
    /*
Обмен валют
долларСША = евро * курс
*/

   // public class Solution {
        public static void main(String[] args) {
            //напишите тут ваш код
            System.out.println(convertEurToUsd(100, 1.08));
            System.out.println(convertEurToUsd(10, 1.08));
            System.out.println(convertEurToUsd(1, 1.08));

        }

        public static double convertEurToUsd(int eur, double exchangeRate) {
            //напишите тут ваш код

            double money = eur * exchangeRate;
            return money;
        }
    }

