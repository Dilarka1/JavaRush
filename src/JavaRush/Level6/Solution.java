package JavaRush.Level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        // temp = num1 < num2 ? num1:num2;
        //result = num3 < temp ? num3:temp;

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int min1 = a < b ? a : b;
        int min2 = c < d ? c : d;
        int min3 = min1 < min2 ? min1 : min2;
        int result = min3 < e ? min3 : e;

        return result;
    }
}


