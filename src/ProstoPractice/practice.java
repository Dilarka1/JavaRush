package ProstoPractice;

public class practice {

        public int x = 10;

        public static int staticX = 100;

        public static void main(String[] args) {

          //  System.out.println(x);//ошибка компиляции, так нельзя!
            System.out.println(staticX);


            System.out.println(practice.staticX);
            System.out.println();
        }

        public void printX() {

           System.out.println(staticX);//а так можно!
            System.out.println(x);
       }
    }
