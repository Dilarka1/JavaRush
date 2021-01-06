package JavaRush.Level13;

import java.io.*;
import java.util.ArrayList;

/*
Писатель в файл с консоли

В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Вывести абсолютно все введенные строки в файл, каждую строчку — с новой строки.

Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего считывать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать все введенные строки (включая "exit") в файл: каждую
строчку — с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.

*/

public class Solution23 {
    // напишите тут ваш код
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String outputFileName = reader.readLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String str;
            while (!(str = reader.readLine()).equals("exit")) {
                writer.write(str + "\n");
            }
            writer.write("exit");
        }
    }
}


//        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = consoleReader.readLine();
//        BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter(fileName));
//        while (true)
//        {
//            String line = consoleReader.readLine();
//            bufferedFileWriter.write(line);
//            if (line.equals("exit")) break;
//        }
//        bufferedFileWriter.flush();
//        bufferedFileWriter.close();
//    }
//}