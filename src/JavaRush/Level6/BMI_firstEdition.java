package JavaRush.Level6;

public class BMI_firstEdition {
    //Weight in kg.
//Height in metres.
    public static void main(String[] args) {
        HumanBMI humanBMI = new HumanBMI(55, 1.56);
        humanBMI.Result();
    }
}

class HumanBMI {
    private double bmi;     //Body Mass Index
    private double weight; //Weight Human
    private double height; // Height Human

    public HumanBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.setBMI();
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setBMI();
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.setBMI();
    }

    public double getBMI() {
        return this.bmi;
    }

    public void setBMI() {
        this.bmi = this.weight / (this.height * this.height);
    }

    public void Result() {

        if (this.bmi < 18.5) {
            System.out.println("Дефицит массы тела. В модели решил переквалифицироваться?");
        } else if (this.bmi <= 25) {
            System.out.println("Норма, ты в форме!");
        } else if (this.bmi < 30) {
            System.out.println("Предожирение. Эй, поосторожнее с пирожными ");
        } else {
            System.out.println("Ожирение. SCHWEINE! Хватит жрать, иди на треню!");
        }
    }
}