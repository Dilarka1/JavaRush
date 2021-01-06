package Calendar_Date;

import java.util.Date;

public class zadacha2 {
    /*
    Вычисление разницы между двумя датами:
     */
    public static void main(String[] args) throws InterruptedException {
        Date currentTime = new Date();           //получаем текущую дату и время
        Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}
