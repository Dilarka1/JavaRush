package JavaRush.Level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Stream3 {
    /*
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция


Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить данные на экран.
•	Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
•	Выведенные числа должны быть упорядочены по убыванию.
•	Метод main должен использовать метод sort.
•	Метод sort должен использовать метод isGreaterThan.
•	Метод sort должен использовать метод isNumber.
*/
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> list = new ArrayList<>();
            while (true) {
                String s = reader.readLine();
                if (s.isEmpty()) {
                    break;
                }
                list.add(s);
            }

            String[] array = list.toArray(new String[0]);
            sort(array);

            for (String x : array) {
                System.out.println(x);
            }
        }

        public static void sort(String[] array) {
            // напишите тут ваш код
            ArrayList<String> list_str = new ArrayList<>();
            ArrayList<Integer> list_int = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])) {
                    list_int.add(Integer.parseInt(array[i]));
                } else {
                    list_str.add(array[i]);
                }
            }
            if (isGreaterThan(array[0], (array[1]))) {
            }
            Collections.sort(list_int);
            Collections.sort(list_str);
            Collections.reverse(list_int);
            int count1 = 0, count2 = 0;
            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])) {
                    array[i] = list_int.get(count1).toString();
                    count1++;
                } else {
                    array[i] = list_str.get(count2);
                    count2++;
                }
            }
        }

        // Метод для сравнения строк: 'а' больше чем 'b'
        public static boolean isGreaterThan(String a, String b) {
            return a.compareTo(b) > 0;
        }


        // Переданная строка - это число?
        public static boolean isNumber(String s) {
            if (s.length() == 0) {
                return false;
            }

            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if ((i != 0 && c == '-') // Строка содержит '-'
                        || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                        || (chars.length == 1 && c == '-')) // или одиночный '-'
                {
                    return false;
                }
            }
            return true;
        }
    }
