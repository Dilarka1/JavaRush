package JavaRush.Level16.Solution21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Клубок

1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении
исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода
showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а
потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном
.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()

Требования:
•	Статический блок класса Solution должен создавать и добавлять 5 нитей в
список threads.
•	Нити из списка threads не должны стартовать автоматически.
•	Нить 1 из списка threads должна бесконечно выполняться.
•	Нить 2 из списка threads должна выводить "InterruptedException" при
возникновении исключения InterruptedException.
•	Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
•	Нить 4 из списка threads должна реализовать интерфейс Message, при вызове
метода showWarning нить должна останавливаться.
•	Нить 5 из списка threads должна читать с консоли числа пока не введено
слово "N", а потом вывести в консоль сумму введенных чисел.
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }

    {

//        threads.add(new Thread(new Thread1()));
//
//        for (int i = 0; i < 5; i++) {
//            if(threads.add(new Thread()){
//            }
//            if (threads.get(i).equals(interrupt())) {
//                threads.add(new Thread());
//                throw InterruptedException;
//            }
//            if ( threads.add(new Thread()){
//                Thread.sleep(500);
//                System.out.println("Ура");
//            }
//            if(threads.equals(Message mesage)){
//                mesage.showWarning;
//                interrupt();
//        }
//        if (threads.add(new Thread())) ;
//    }
    }
}