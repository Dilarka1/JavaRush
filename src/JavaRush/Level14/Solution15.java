package JavaRush.Level14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
•	Программа должна вывести на экран все четные числа, считанные из файла,
отсортированные по возрастанию.
•	Программа должна закрывать поток чтения из файла — FileInputStream.
*/

public class Solution15 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine()) ;
            //   int num = Integer.parseInt(reader.readLine());

//                Scanner scanner = new Scanner(System.in);
//                for(int i = 0; i < numbers.lengh; i++){
//                numbers[i] = scanner.nextInt();
//                }
//
//                Arrays.asList(numbers).str
//        }
//                int num = scanner.nextInt();
//
//                Arrays.asList()
//

        }
    }

// Arrays.asList(9, 6, 3, 5, 8, 2, 4, 1).stream().filter(num2 -> num2 % 2 == 0).sorted(Comparator.reverseOrder()).forEach(num2 -> System.out.print(num2));