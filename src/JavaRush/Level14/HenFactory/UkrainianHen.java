package JavaRush.Level14.HenFactory;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    String getDescription(){
        return super.getDescription() + "Моя страна " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
