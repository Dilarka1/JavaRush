package JavaRush.Level17.Solution2;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут

        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}

/*


•	Метод getFund() должен содержать синхронизированный блок.
•	Внутри синхронизированного блока должно быть проинициализировано поле imf.
•	Метод getFund() должен всегда возвращать один и тот же объект.
*/