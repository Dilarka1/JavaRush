package JavaRush.Level7;

import java.util.ArrayList;

public class ArrayList1 {

    /*
Что за список такой?

1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

Требования:
•	Программа не должна ничего считывать с клавиатуры.
•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
•	Программа должна добавить 5 любых строк в список.
•	Программа должна вывести размер списка на экран.
•	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
*/

        public static void main(String[] args) {
            //напишите тут ваш код

            ArrayList<String>list = new ArrayList<String>();
            list.add("Damir");
            list.add("Kamila");
            list.add("Salim");
            list.add("Marat");
            list.add("Dilara");

            System.out.println(list.size());

            for(String lists: list){
                System.out.println(lists);

            }
        }
    }