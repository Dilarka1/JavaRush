package JavaRush.Level1_4;

public class таблицаУмножения {
    /*
Таблица умножения
*/


        public static void main(String[] args) {
            //напишите тут ваш код
            System.out.println("1  2  3  4  5  6  7  8  9  10");
            System.out.println("2  4  6  8  10 12 14 16 18 20");
            System.out.println("3  6  9  12 15 18 21 24 27 30");
            System.out.println("4  8  12 16 20 24 28 32 36 40");
            System.out.println("5  10 15 20 25 30 35 40 45 50");
            System.out.println("6  12 18 24 30 36 42 48 54 60");
            System.out.println("7  14 21 28 35 42 49 56 63 70");
            System.out.println("8  16 24 32 40 48 56 64 72 80 ");
            System.out.println("9  18 27 36 45 54 63 72 81 90");
            System.out.println("10 20 30 40 50 60 70 80 90 100");
            System.out.println("******************************");

           MultiTable();

            System.out.println("********************************");

            System.out.println(multiplicationTable(1));
            System.out.println(multiplicationTable(2));
            System.out.println(multiplicationTable(3));
            System.out.println(multiplicationTable(4));
            System.out.println(multiplicationTable(5));
            System.out.println(multiplicationTable(6));
            System.out.println(multiplicationTable(7));
            System.out.println(multiplicationTable(8));
            System.out.println(multiplicationTable(9));
            System.out.println(multiplicationTable(10));


        }
        public static void MultiTable(){
            for (int i = 1; i < 11; i ++){
                for (int b = 1; b < 10; b ++){
                    System.out.print(i * b + " ");
                }
                System.out.println(i * 10);
            }

        }

        public static String multiplicationTable (int number){


            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            int e = 5;
            int f = 6;
            int g = 7;
            int h = 8;
            int i = 9;
            int j = 10;
            String s = number * a + " " + number * b + " " + number * c + " " + number * d + " " + number * e + " " + number * f + " " + number * g + " " + number * h + " " + number * i +" " + number * j;

            return s;

        }

}



