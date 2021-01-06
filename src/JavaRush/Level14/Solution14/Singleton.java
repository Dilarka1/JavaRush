package JavaRush.Level14.Solution14;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {

        return instance;
    }

    private Singleton() {

    }
}