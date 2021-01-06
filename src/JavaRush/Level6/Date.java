package JavaRush.Level6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("dd MM yyyy").format(Calendar.getInstance().getTime()));

    }
}
