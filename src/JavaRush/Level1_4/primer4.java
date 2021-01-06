package JavaRush.Level1_4;

public class primer4 {

    public static void main(String[] args) {
        Student olga = new Student();
        olga.name = "Olga";
        olga.age = 21;

        Student vera = new Student();
        vera.name = "Veronika";
        vera.age = 15;

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);

        Student a = olga, b = vera;

        int c = a.age;
        a.age = b.age;
        b.age = c;

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);
    }


    static class Student {
        String name;
        int age;
    }
}

