package JavaRush.Level10;

public class Solution {
    /*
Расставьте минимум static-ов

Расставь как можно меньше модификаторов static так, чтобы пример скомпилировался.

Требования:
•	В классе должна быть переменная A.
•	В классе должна быть переменная B.
•	В классе должна быть переменная C.
•	В классе должна быть переменная D.
•	Метод main не изменяй.
•	Метод getA не изменяй.
     */

        public int A = 5;
        public static int B = 5;
        public static int C = 5;
        public static int D = 5;

        public static void main(String[] args) {
            Solution solution = new Solution();
            solution.A = 5;
            solution.B = 5 * B;
            solution.C = 5 * C * D;
            Solution.D = 5 * D * C;

            Solution.D = 5;
        }

        public int getA() {
            return A;
        }
    }