package JavaRush.Level15.Solution12;

class  TeaMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");

    }

    @Override
    void pour() {
        System.out.println("Заливаем кипятком");

    }
}