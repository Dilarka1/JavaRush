package JavaRush.Level5;

import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            sum += num;
            if (num == -1) {

                System.out.println(sum);
                break;
            }
        }
    }
}

