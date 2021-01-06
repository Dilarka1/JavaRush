package JavaRush.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Block_29 {
    /*
Модернизация ПО

Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать один метод.
•	Программа должна вывести фамилию семьи по введенному городу.
*/
    public static void main(String[] args) throws IOException {
        //   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();
        String city = scanner.nextLine();
        String family = scanner.nextLine();
        map.put(city, family);
//        if (map.keySet().isEmpty()) {
//        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(value);

        }
    }
}


       // while (true) {
            //  String family = reader.readLine();
            // String family = scanner.nextLine();
            //if (family.isEmpty()) {
            //    break;
            // }


            // Read the house number
            //  String city = reader.readLine();
//            String city = scanner.nextLine();
//            String family = "";
//            if (city.isEmpty()) break;
//            else family = scanner.nextLine();
//
//            String familyName = map.get(city);
//            System.out.println(familyName);
//        }
//    }
//}
