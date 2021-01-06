package JavaRush.Level1_4;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);
        System.out.println(number10());

        System.out.println((2 * (3 + (4 * (5) + 6) )* 7)); //382
        System.out.println((2 * (3 + 4 * (5 + 6 * 7))));

    }

    public static int number10() {
        int num1 = 1;
        for (int i = 1; i <= 10; i++) {
            num1 = num1 * i;

        }
        return num1;


    }
}


