package JavaRush.Level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Парсер реквестов

Для решения этой задачи тебе нужно:
Считать с консоли URL-ссылку.
Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &,
например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (дробные числа разделяются точкой);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров
на экран.
Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14

Требования:
•	Программа должна считывать с клавиатуры только одну строку.
•	Класс Solution не должен содержать статические поля.
•	Программа должна выводить данные на экран в соответствии с условием.
•	Программа должна вызывать метод alert() с параметром double, если значение параметра obj
можно корректно преобразовать в число типа double.
•	Программа должна вызывать метод alert() с параметром String, если значение параметра obj
нельзя корректно преобразовать в число типа double.

http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
*/

public class Solution22 {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String a = str.substring(str.indexOf("?") + 1);
        String b = "&";
        String[] word = a.split(b);

        for (int i = 0; i < word.length-1; i++) {
            if (word[i].contains("=")) {
                System.out.print(word[i].substring(0, word[i].indexOf("=")) + " ");
            } else {
                System.out.print(word[i] + " ");
            }
        }

        for (int i = 0; i < word.length; i++) {
            if (word[i].contains("=")) {
                if(word[i].substring(0, word[i].indexOf("=")).equals("obj") && isDouble(word[i])){
                    alert(Double.parseDouble(word[i].substring(word[i].indexOf("=") + 1)));
                }else if(word[i].substring(0, word[i].indexOf("=")).equals("obj") && word[i].contains("=")){
                    alert(word[i].substring(word[i].indexOf("=") + 1));
                }
            }
        }
    }

        public static boolean isDouble(String str){
            try {
                String  c = str.substring((str.indexOf("=")+1));
                Double d = Double.parseDouble(c);
                return true;
            } catch (NumberFormatException e){
                return false;
            }
        }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
