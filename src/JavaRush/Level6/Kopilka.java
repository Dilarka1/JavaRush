package JavaRush.Level6;

import java.util.Scanner;

public class Kopilka {

    /*
Консоль-копилка

Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная
строка, например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
*/
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            String num = scanner.nextLine();

            if (num.equals("сумма")) {
                break;
            } else {
                sum += Integer.parseInt(num);
            }
        }
        System.out.println(sum);
    }
}