package JavaRush.Level13;

import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/*
Сортировка четных чисел из файла

В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10

Требования:
•	Программа должна считывать данные с консоли.
•	Программа должна создавать FileInputStream для введенной с консоли строки.
•	Программа должна выводить данные на экран.
•	Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
•	Программа должна закрывать поток чтения из файла — FileInputStream.
*/

public class Solution24 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try(FileInputStream file = new FileInputStream(reader.readLine())){

                    ArrayList<Integer> numbers = new ArrayList<>();
                    while(file.available() > 0){

                      //  int number = Integer.parseInt(reader.readLine());
//                        if (number % 2 == 0){
//                            numbers.add(number);
//                        }
                       // while (true) {
                            int number = Integer.parseInt(reader.readLine());
                            numbers.add(number);
                        }

                        Stream<Integer>numberStream = numbers.stream();
                        numberStream.filter(num -> num % 2 == 0).forEach(num -> System.out.println(num));
                    }
                }
//                Collections.sort(numbers);
//                for (int i = 0; i < numbers.size(); i++){
//                    System.out.print(numbers.get(i) + "\n");
                }




//        FileInputStream aaa = new FileInputStream (s);
//        aaa.close ();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int input = Integer.parseInt(reader.readLine());
//        reader.close();
//        InputStream inStream = new FileInputStream(str);
//
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        while (true) {
//            int input = scanner.nextInt();
//            list.add(input);
//
//            for (int i = 0; i > list.size(); i++) {
//                if (list.get(i) % 2 == 0) {
//                    list2.add(i);
//                }
//            }
//            System.out.println(list2.stream().sorted());
//        }
//    }
//}
//

//        for (int i = 0; i > list.length(); i++) {
//
//            list.add(str);
//            list.stream().sorted();
//            System.out.println(list.toString());
//        }
//
//        while (inStream.available() > 0) {
//            int data = inStream.read();
//            char ch = (char) data;
//            System.out.print(ch);
//        }
//        inStream.close();
//    }
//}