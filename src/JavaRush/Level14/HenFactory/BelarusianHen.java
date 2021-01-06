package JavaRush.Level14.HenFactory;

public class BelarusianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 28;
    }

    String getDescription(){
        return super.getDescription() + "Моя страна " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
