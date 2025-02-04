package JavaRush.Level15.Solution12;

public abstract class DrinkMaker {

    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();

    }
}