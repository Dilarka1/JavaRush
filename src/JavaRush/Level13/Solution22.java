package JavaRush.Level13;

import java.io.*;
import java.util.Scanner;

public class Solution22 {
    /*
    Чтение файла

    В этой задаче тебе нужно:
    Считать с консоли имя файла.
    Вывести в консоли (на экран) содержимое файла.
    Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
    Требования:
    •	Программа должна считывать c консоли имя файла.
    •	Программа должна выводить на экран содержимое файла.
    •	Поток чтения из файла (FileInputStream) должен быть закрыт.
    •	BufferedReader также должен быть закрыт.
    */
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        InputStream inStream = new FileInputStream(fileName);

        while (inStream.available() > 0) {
            int data = inStream.read();
            char ch = (char) data;
            System.out.print(ch);
        }
        inStream.close();
    }
}