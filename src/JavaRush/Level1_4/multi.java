package JavaRush.Level1_4;

public class multi {
    public static void main(String[] args) throws Exception {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {

                int all = i * j;
                System.out.print(i * j + " ");
                j++;

            }
            System.out.println();
            i++;
        }
    }
}