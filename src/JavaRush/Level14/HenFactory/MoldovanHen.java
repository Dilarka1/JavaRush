package JavaRush.Level14.HenFactory;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 29;
    }

    String getDescription(){
        return super.getDescription() + "Моя страна " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
