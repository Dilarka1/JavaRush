package JavaRush.Level10;

public class zadacha4 {
    /*
Задача №5 на преобразование целых типов

Правильно расставь операторы приведения типа, чтобы получился ответ: c = 256.
int a = (byte)44;
int b = (byte)300;
short c = (byte)(b - a);

Требования:
•	Программа должна выводить текст на экран.
•	Нельзя менять команду вывода на экран.
•	Метод main() должен содержать переменную a типа int.
•	Метод main() должен содержать переменную b типа int.
•	Метод main() должен содержать переменную c типа short.
•	Начальное значение переменных при инициализации менять нельзя.
Можно изменять только операторы приведения типа.
•	Программа должна выводить число 256.
*/
        public static void main(String[] args) {
            int a = (byte) 44;
            System.out.println(a);
            int b = (int) 300;
            System.out.println(b);
            short c = (short) (b - a);
            System.out.println(c);
        }
    }