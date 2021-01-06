package JavaRush.Level6;

import java.util.Scanner;

public class FixSum {
    public static void main(String[] args) throws Exception {
      Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
