package JavaRush.Level5;

import java.util.Scanner;

public class middleOf3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min){
            min = c;
        }

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }

        System.out.print(a+b+c - (min + max));
    }
}
