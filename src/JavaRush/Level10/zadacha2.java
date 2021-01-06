package JavaRush.Level10;

public class zadacha2 {
    /*
Задача №2 на преобразование целых типов

Правильно расставь операторы приведения типа, чтобы получился ответ: d=3.765.
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;

Требования:
•	Программа должна выводить текст на экран.
•	Нельзя менять команду вывода на экран.
•	Метод main() должен содержать переменную a типа int.
•	Метод main() должен содержать переменную b типа int.
•	Метод main() должен содержать переменную c типа float.
•	Метод main() должен содержать переменную d типа double.
•	Начальное значение переменных при инициализации менять нельзя.
Можно добавлять только операторы приведения типа.
•	Программа должна выводить число 3.765.
*/

        public static void main(String[] args) {
            int a = 15;
            int b = 4;
            float c = (float) a / b;
            System.out.println(c);
            double d = (double)a * 1e-3 + c;

            System.out.println(d);

            int c1 = 10000;
            byte d1 = (byte) c;
            System.out.println("byte d1 = (byte) c1: " + d1); //16


            int c2 = 10;
            byte d2 = (byte) c2;
            System.out.println("byte d2 = (byte) c2: " + d2);


            System.out.println("*************************");
            float f = 10000;
            long l = (long) (f * f);
            float f2 = l;
            long l2 = (long) f2;
            System.out.println("long l = (long) (f * f): " + l);
            System.out.println("float f2 = l: " + f2);
            System.out.println("long l2 = (long) f2: " + l2);


            System.out.println("***************************");
            double d3 = 1;
            System.out.println("double d3 = 1: " + d3);
            float f3 = (float) d3;
            System.out.println("f3 = (float) d3: " + f3);
            long l3 = (long) f3;
            System.out.println("long l3 = (long) f3: " + l3);
            int i = (int) l3;
            System.out.println("int i = (int) l3: " + i);
            short s = (short) i;
            System.out.println("short s = (short) i: " + s);
            byte b3 = (byte) s;
            System.out.println("byte b3 = (byte) s:" + b3);
        }
    }