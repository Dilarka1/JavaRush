package JavaRush.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Level7 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[10];

        //заполнение массива
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
}
        //вывод на экран
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);

        scanner.close();
    }
}