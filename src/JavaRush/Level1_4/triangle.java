package JavaRush.Level1_4;

public class triangle {

    public static void main(String[] args) {
        //напишите тут ваш код

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

        System.out.println("********************");

        int g = 1;
        while (g <= 15) {
            int d = 1;
            while (d <= g) {
                System.out.print("%");
                d++;
            }
            System.out.println();
            g++;
        }
        //

        int h = 1;
        while (h <= 5) {
            for (int t = 1; t <= h; t++) {
                System.out.print("@");
            }
            System.out.println();
            h++;
        }
    }
}