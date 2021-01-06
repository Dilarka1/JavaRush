package JavaRush.Level7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6_2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).length()) max = list.get(i).length();
        }
        int min = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i).length()) min = list.get(i).length();
        }
        int maxindex = 0;
        int minindex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) maxindex = i;
            if (list.get(i).length() == min) minindex = i;

        }
        if (maxindex < minindex) System.out.println(list.get(maxindex));
        else System.out.println(list.get(minindex));
    }
}