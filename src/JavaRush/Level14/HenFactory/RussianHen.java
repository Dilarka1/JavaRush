package JavaRush.Level14.HenFactory;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription(){
        return super.getDescription() + "Моя страна " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
