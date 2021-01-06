package JavaRush.Level5;

import java.util.Scanner;

public class среднееАрифметическое {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double add = 0;
        double num = 0;
        while (true) {
            num = scanner.nextDouble();
            if (num == -1)
                break;
            sum += num;
            add += 1;
        }
                System.out.println(sum / add);
                //1 2 2 4 5 -1



        Scanner scan = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        while (true) {
             a = scan.nextDouble();
            if (a == -1)
                break;
            b = b + a;
            c = c + 1;
        }
        System.out.println(b / c);
    }
}

