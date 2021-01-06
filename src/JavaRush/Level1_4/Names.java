package JavaRush.Level1_4;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {


    /*
    Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить
     */
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0 && a < 0) {
            System.out.println("отрицательное четное число");
        } else if (a % 2 == -1 && a < 0) {
            System.out.println("отрицательное нечетное число");
        } else if (a % 2 == 0 && a > 0) {
            System.out.println("положительное четное число");
        } else if (a % 2 == 1 && a > 0) {
            System.out.println("положительное нечетное число");
        }
//        else if (a == 0){
//            System.out.println("0");
//        }
        else {
            System.out.println(0);
        }
        sc.close();
        scanner.close();
    }
}
