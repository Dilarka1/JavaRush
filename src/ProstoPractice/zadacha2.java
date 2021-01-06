package ProstoPractice;

public class zadacha2 {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int z = 10; z >= 0; z--) {
            for (int i = 1; i <= z; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
