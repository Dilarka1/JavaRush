package Calendar_Date;

import java.util.Date;

public class zadacha6 {
    public static void main(String[] args) {
        Date myBirthday = new Date();
        myBirthday.setHours(0);
        myBirthday.setMinutes(0);
        myBirthday.setSeconds(0);

        myBirthday.setDate(28);      // первое число
        myBirthday.setMonth(2);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - myBirthday.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance / msDay); //количество целых дней
        System.out.println("Days from my birthday: " + dayCount);
    }
}

