package JavaRush.Level13;

public class Solution12 {
    /*
Код сам не исправится

Исправь код так, чтобы программа выполнялась и выводила фразу:
"Я переводчик с английского".
Метод main менять нельзя!

Требования:

•	Программа должна выводить на экран фразу: "Я переводчик с английского".
•	Метод translate должен возвращать строку: "Я переводчик с английского".
•	Программа должна выполняться без ошибок.
•	Метод main должен выводить на экран результат вызова метода translate
 у объекта типа Translator.
*/

    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }
}