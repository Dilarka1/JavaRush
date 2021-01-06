package Calendar_Date;


import java.util.Date;

public class Data {
    /*
    Получение текущей даты:
     */
    public static void main(String[] args) throws Exception
    {
        Date today = new Date();
        Date date1 = new Date();

        Date date2 = new Date();
        System.out.println("Current date: " + today);

        System.out.println((date1.getTime() > date2.getTime())?
                "date1 позже date2" : "date1 раньше date2");
        System.out.println(date1 + " " + date2);

    }
}
