package Calendar_Date;

import java.util.Date;

public class zadacha4 {
    /*
    Сколько прошло времени с начала сегодняшнего дня:
     */
    public static void main(String[] args) {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }
}
