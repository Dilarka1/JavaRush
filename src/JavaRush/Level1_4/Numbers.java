package JavaRush.Level1_4;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        if ( a > b & b > c){
            System.out.println(a + " " + b + " " + c);
        }
        else if (b > c && c > a){
            System.out.println(b + " " + c + " " + a);
        }
        else if (c > a && a > b){
            System.out.println(c + " " + a + " " + b);
        }
        else if (c > b && b > a){
            System.out.println(c + " " + b + " " + a);
        }
        else if (a > c && c > b){
            System.out.println(a + " " + c + " " + b);
        }
        else if (b > a && a > c){
            System.out.println(b + " " + a + " " + c);
        }
    }
}


