package JavaRush.Level6;

import java.io.IOException;
import java.util.Scanner;
/*
Чётные и нечётные циферки
*/

public class OddEven {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();

        for (int i = 0; i <= stroka.length() - 1; i++) {
            if (stroka.charAt(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
            System.out.println("Even: " + even + " Odd: " + odd);
        }
    }