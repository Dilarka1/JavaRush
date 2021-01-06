package JavaRush.Level7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class List7 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            Thread.sleep(100);
            System.out.println(i);
        }
        System.out.println("Бум!");
    }
}