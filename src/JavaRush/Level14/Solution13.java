package JavaRush.Level14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution13 {

    /*
НОД

Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.

Требования:
•	Программа должна считывать с клавиатуры 2 строки.
•	Если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
•	Программа должна выводить данные на экран.
•	Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры,
 и успешно завершаться.

*/

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int ber = scanner.nextInt();
        int ike = scanner.nextInt();

        if (ber > 0 && ike > 0) {
            System.out.println(berIke(ber, ike));
        }
    }

    public static int berIke(int a, int b) {
        try {
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
        } catch (Exception e) {
        }
        return a;
    }
}

