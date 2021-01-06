package JavaRush.Level15;

/*
Все лишнее - прочь!
*/

public class Solution7 {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);

        // add("1", 2d);
        add((byte) 1, 2d);
        add(2d, 2);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}