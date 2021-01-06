package ProstoPractice;

public class School {

    private DayOfWeek dayOfWeek;
    //...другие поля


    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek("Sunday");
        System.out.println(dayOfWeek);

    }
}