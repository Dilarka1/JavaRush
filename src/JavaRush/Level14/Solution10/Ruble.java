package JavaRush.Level14.Solution10;

public class Ruble extends Money{
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
