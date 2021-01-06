package JavaRush.Level9;

import java.util.ArrayList;
import java.util.Scanner;

public class zadacha3 {
    /*
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить две строки.
•	Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
•	Вторая строка должна содержать только согласные и знаки препинания из введенной строки,
разделенные пробелом.
•	Каждая строка должна заканчиваться пробелом.
*/
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
          Scanner input = new Scanner(System.in);
         String text = input.nextLine();
        ArrayList<String> list = new ArrayList<>();
        list.add(text);
        String[] array = list.get(0).split(" ");
        ArrayList<Character> noVow = new ArrayList<Character>();

        for (String arr : array) {
            char[] temp = arr.toCharArray();
            for (char ch : temp) {
                if (isVowel(ch))
                    System.out.print(ch + " ");
                else
                    noVow.add(ch);
            }
        }
        System.out.println();
        for (char ch : noVow)
            System.out.print(ch + " ");
    }

            // метод проверяет, гласная ли буква
            public static boolean isVowel ( char c){
                c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
                for (char d : vowels) {  // ищем среди массива гласных
                    if (c == d) {
                        return true;
                    }
                }
                return false;
            }
        }