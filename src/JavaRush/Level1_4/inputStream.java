package JavaRush.Level1_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class inputStream {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in); // declaration
        String name = input.nextLine(); // only allows user to enter byte value

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");


        Scanner input2 = new Scanner(System.in);
        String name1 = input2.nextLine();
        int number = input2.nextInt();

        System.out.println(name1 + " захватите мир через " + number + " лет. Му-ха-ха!");


input2.close();
input.close();
    }
}
