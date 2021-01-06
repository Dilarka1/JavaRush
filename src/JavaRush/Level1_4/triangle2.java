package JavaRush.Level1_4;

import java.util.Scanner;

public class triangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height, i, j, k;
        System.out.println("Height: ");
        height = scanner.nextInt();

        while (height <= 8) {
            for (int t = 1; t < height; t++) {
                System.out.print("@");
            }
            System.out.println();
            height++;
        }
    }
}




        // Get height of pyramid from user
//        do {
//            System.out.println("Height: ");
//            height = scanner.nextInt();
//        }
//        while (height < 0 || height > 8);

        // Print lines
//        for (i = 0; i < height; i++) {
//            for (j = 0; j < i; j++) {
//                System.out.println("#");
//            }
//            //  for (k = 0; k < i + 1; k++) {       // print hashes
//            System.out.println();
//        }
        //   System.out.println(" ");
