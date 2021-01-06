package JavaRush.Level9;

import java.util.ArrayList;
import java.util.HashMap;

public class Exception2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        //напишите тут ваш код
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException has been caught.");

        }

        try {

            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {

        }

        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException has been caught");
        }

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException has been caught");
        }

        try {
            String s = null;

            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException has been caught");
        }

        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException has been caught");
        }
    }
}
