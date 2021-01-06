package JavaRush.Level17.Solution3;

public class OurPresident {
    private static OurPresident president;

    static {

        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}



/*
Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте president.

•	Класс OurPresident должен содержать статический блок.
•	Внутри статического блока класса OurPresident должен быть синхронизированный блок.
•	Внутри синхронизированного блока должно быть проинициализировано поле president.
 */