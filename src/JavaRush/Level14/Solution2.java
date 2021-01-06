package JavaRush.Level14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Коты

Давай напишем программу, которая будет давать имена всем котикам, выпускаемым на нашей котофабрике.
Для этого нужно:
Считывать строки (параметры) с консоли, пока пользователь не введет пустую строку (Enter).
Для каждого параметра (имени кота):
создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
вывести на экран cat.toString().
Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна прекращать считывать данные после ввода пустой строки.
•	Программа должна выводить на экран описание каждого кота (cat.toString).
•	Программа должна создавать объект класса Cat для каждого введенного имени кота
 (строки, считанной с клавиатуры) c помощью метода getCatByKey.

*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.isEmpty()) {
//                break;
//            }
//            Cat cat = getCatByKey(input);
//            System.out.println(cat);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String a = reader.readLine();
                if (a.isEmpty())
                    break;
                Cat cat = CatFactory.getCatByKey(a);
                System.out.println(cat);
            }
        }
    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
//System.out.println(CatFactory.getCatByKey(temp));