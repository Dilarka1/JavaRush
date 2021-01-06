package JavaRush.Level1_4;
import java.util.Scanner;
public class trafficLights {

/*
Переходим дорогу вслепую
*/
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            Scanner scanner = new Scanner(System.in);
            double t = scanner.nextDouble();


            if (t % 5 >= 0 && t % 5 < 3.0) {
                System.out.println("зелёный");
            } else if (t % 5 >= 3.0 && t % 5 < 4.0) {
                System.out.println("жёлтый");
            } else if (t % 5 >= 4.0 && t % 5 <= 5.0) {
                System.out.println("красный");
            }
        }





//       Scanner sc = new Scanner(System.in);
//        double t2 = sc.nextDouble();
//        int b = 5;
//        if ((t2%b)>= 0  && (t2%b) <3.0)
//            System.out.println("Зеленый");
//        if ((t2%b)>= 3.0  && (t2%b) < 4.0)
//            System.out.println("Желтый");
//        if ((t2%b)>= 4.0  && (t2%b) <= 5.0)
//            System.out.println("Красный");
//
//    }
}

