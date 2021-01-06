package JavaRush.Level7;

    /*
Один большой массив и два маленьких

1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать большой массив на 20 целых чисел.
•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
•	Программа должна создавать два маленьких массива на 10 чисел каждый.
•	Программа должна скопировать одну половину большого массива в первый маленький,
 а вторую - во второй и вывести второй маленький массив на экран.
*/

import java.util.Scanner;

public class bigStr {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int[] bigArr = new int[20];

        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = scanner.nextInt();
        }

        int[] smallArr1 = new int[10];
//        for (int o = 0; o < 10; o++) {
//            smallArr1[o] = bigArr[o];
//            //   System.out.println(smallArr1[o]);
//        }
//
        int[] smallArr2 = new int[10];
//        for (int h = 0; h < 20; h++) {
//            bigArr[h] = smallArr2[h];
//            for (int j = 10; j < 20; j++) {
//               // smallArr2[j] = bigArr[j];
//                System.out.println("Second smallArr2: " + smallArr2[j]);
//            }


        for (int i = 0; i < 10; i++) {
            smallArr1[i] = bigArr[i];
            smallArr2[i] = bigArr[i + 10];
            System.out.println(smallArr2[i]);
        }
    }
}