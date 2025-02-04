package JavaRush.Level7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewList5 {
    /*
Не компилируется задача про котиков

Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.

Пример:
Cat's name: Barsik, age: 6, weight: 5, tail: 22
Cat's name: Murka, age: 8, weight: 7, tail: 20

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Если пользователь ввел пустую строку вместо имени, то программа должна вывести данные на экран и завершиться.
•	Если пользователь ввел: Barsik, 6, 5 и 22 (каждое значение с новой строки), то программа должна
вывести "Cat's name: Barsik, age: 6, weight: 5, tail: 22".
•	Если пользователь ввел: Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна
вывести "Cat's name: Murka, age: 8, weight: 7, tail: 20".
•	Если пользователь ввел: Barsik, 6, 5, 22, Murka, 8, 7 и 20 (каждое значение с новой строки),
 то программа должна вывести две строки: "Cat's name: Barsik, age: 6, weight: 5, tail: 22" и
 "Cat's name: Murka, age: 8, weight: 7, tail: 20".

*/

    //    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //  String name = reader.readLine();

    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();

            if (name == null || name.isEmpty()) {
                break;
            }
            int age = scanner.nextInt();
            int weight = scanner.nextInt();
            int tailLength = scanner.nextInt();
            scanner.nextLine();

            Cat cat = new Cat(name, age, weight, tailLength);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}