package JavaRush.Level1_4;


public class таблицаУмножения2 {
    public static void main(String[] args) {
        int i = 1;
        int b = 1;

        for ( i = 1; i < 11; i ++) {
            for (b = 1; b < 10; b++) {
                System.out.print(i * b + " ");
            }
            System.out.println(i * 10);
        }

            System.out.println("*********************");


            int i2 = 1;
            int i3 = 1;
            while (i2 <= 10) {
                System.out.print(1 * i2 + " ");
                i2++;
                while (i3 <= 10) {
                    i3++;
                    System.out.println(i2 * i3 + " ");
                }
                System.out.println(" ");
            }


//        while (i <= 10){
//            while (b <= 10){
//
//                System.out.print(i * b + " ");
//
//                i++;
//
//            }
//            System.out.println(i * 10);
//            b++;
//        }

    }
}

