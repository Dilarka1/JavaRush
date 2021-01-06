package ProstoPractice;

import java.util.Scanner;

public class zadacha {
    /*
		         calculator program:
		        write a program that asks user user if he/she wants to: *, / , %, - , +

		         then ask user to enter two number

		         then return the result to the console

		         and then ask the user if they wanna continue to do another math
		         if yes ==> repeat the previous steps,
		         if no ==> exit the system
		         other wise ==> ask the user to re enter

		         */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to use? *, / , %, - , +");
        String znak = scanner.nextLine();
        System.out.println("Please enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (znak.equals("*")) {
            System.out.println(number1 * number2);
        }
        if (znak.equals("/")) {
            System.out.println(number1 / number2);
        }
        if (znak.equals("%")) {
            System.out.println(number1 % number2);
        }
        if (znak.equals("-")) {
            System.out.println(number1 - number2);
        }
        if (znak.equals("+")) {
            System.out.println(number1 + number2);
        }
    }
}