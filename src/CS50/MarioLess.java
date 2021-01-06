package CS50;

import java.util.Scanner;

public class MarioLess {

        /*
        How to write in C


        int height, row, column, space;
    do
    {
        height = get_int("Height: ");
    }
    while (height < 1 || height > 8);

    for(row = 0; row < height; row ++)
    {
        for(space = 0; space < height - row - 1; space ++)
        {
            printf(" ");
        }
        for(column = 0; column <= row; column++)
        {
            printf("#");
        }
        printf("\n");
    }
}
         */
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = 5;
                int row, column, space;
//        do {
//            System.out.println("Height: ");
//            height = scanner.nextInt();
//        }
//        while (height >= 8);

//        for (row = 1; row <= height; row++) {
//          //  for (space = 0; space < height - row - 1; space++) {
//            //    System.out.println(" ");
//            //}
//            for (column = 1; column <= row; column++) {
//                System.out.println("#");
//            }
//            System.out.println();


            for (row = 0; row < height; row++) {
                for(space = 0; space < height - row -1; space++){

                }
                for (column = 0; column <= row; column++) {
                    System.out.print(8);
                }
                System.out.println();
            }



        }
    }
