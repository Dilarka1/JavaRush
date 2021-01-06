package JavaRush.Level1_4;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();

        int m = 5;
        int n = 4;

        int i = 0;
        while (i <= m) {
            i++;
            System.out.println("");
            int j = 1;
            while (j <= n && i <= m) {
                System.out.print(8);
                j++;
            }
        }
        System.out.println("********************");


        for (int c = 0; c < m; c++) {
            for (int b = 0; b < n; b++) {
                System.out.print(8);
            }
            System.out.println();
        }

        System.out.println("*******************");

        int z = 5;
        while (z > 0) {

            int j = 1;
            while (j <= 5) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            z--;
        }

        System.out.println("******************");

        for (int h = 0; h < 5; h++) {
            for(int x = 1; x <=5; x++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int k = 1; k <=7; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
