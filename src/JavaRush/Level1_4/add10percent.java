package JavaRush.Level1_4;

public class add10percent {
    /*
Задача на проценты
Напиши код метода addTenPercent,
который увеличивает переданное целое число на 10%.
*/

    //  public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        // double ten = i + i * 1.1;
        return i + (i * 0.1);

    }
    public static double add15Percent(int i){
        return i + (i * 0.15);
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(40));
        System.out.println(add15Percent(45));
    }
}
