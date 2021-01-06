package JavaRush.Level8;

import java.util.HashSet;
import java.util.Set;

public class Block_2 {
    /*
20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
•	Не изменяй заголовок метода createSet().
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
•	Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/


    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("л" + i);

        }
        return set;
    }

    public static void main(String[] args) {
    }
}
