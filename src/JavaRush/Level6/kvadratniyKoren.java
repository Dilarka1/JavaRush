package JavaRush.Level6;

public class kvadratniyKoren {
        public static double getDistance(int x1, int y1, int x2, int y2) {


            return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }
        public static void main(String[] args) {
            System.out.println(getDistance(5,8,6,4));

        }
    }
