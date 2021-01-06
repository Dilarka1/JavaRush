package JavaRush.Level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Max {


    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        //int n =reader.nextInt() ;

        //напишите тут ваш код
        int n = reader.nextInt();
        int maximum = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {

                int t = reader.nextInt();
                if (i == 0) maximum = t;
                if (maximum < t) maximum = t;
            }
        }
        if (n > 0) System.out.println(maximum);

    }
}

