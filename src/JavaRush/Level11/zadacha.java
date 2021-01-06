package JavaRush.Level11;

import java.util.Arrays;

public class zadacha {
/*
Минимакс

Напиши метод, который возвращает минимальное и максимальное числа в массиве.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Класс Pair не изменяй.
•	Метод main не изменяй.
•	Допиши реализацию метода getMinimumAndMaximum: он должен возвращать пару из
 минимума и максимума.
•	Программа должна вывести правильный результат.
•	Метод getMinimumAndMaximum не должен изменять массив inputArray.
 */

    public static void main(String[] args) {
        // int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        int[] data = new int[]{-1, -2, -3, -5, -2, -8, -77, -5, -5};

        //int[] data = new int[]{1, 2, 3, 5, 2, 8, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        // напишите тут ваш код
     //   int max = 0;
       // int min = 0;
      //  for (int i = 1; i < inputArray.length; i++) {
//                if(inputArray[i] > y){
//                    y = inputArray[i];
//                }if (inputArray[i] < x){
//                    x = inputArray[i];
//                }
//            }
//
//            return new Pair<Integer, Integer>(x, y);
//        }

            int x = Arrays.stream(inputArray).min().getAsInt();
            int y = Arrays.stream(inputArray).max().getAsInt();
            return new Pair<Integer, Integer>(x, y);
        }

      //      min = Math.min(min, inputArray[i]);
      //      max = Math.max(max, inputArray[i]);




//    max= Integer.MAX_VALUE;
//min = Integer.MIN_VALUE;
// }
//            return new Pair<Integer, Integer>(min, max);
//        }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}