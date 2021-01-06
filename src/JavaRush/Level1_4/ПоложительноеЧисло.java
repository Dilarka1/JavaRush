package JavaRush.Level1_4;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class ПоложительноеЧисло {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = 0;
        int e = 0;

        if (a > 0) d++;
        if (b > 0) d++;
        if (c > 0) d++;
        if (a < 0) e++;
        if (b < 0) e++;
        if (c < 0) e++;

        System.out.println("количество отрицательных чисел: " + e);
        System.out.println("количество положительных чисел: " + d);

    }
}