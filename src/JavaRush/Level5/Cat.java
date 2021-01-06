package JavaRush.Level5;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код

        int a = 0;
        int b = 0;


        if (age > anotherCat.age) a++;
        else b++;

        if (weight > anotherCat.weight) a++;
        else b++;

        if (strength > anotherCat.strength) a++;
        else b++;

        if (a < b) return false;
        else return true;


    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 3;
        cat1.weight = 7;
        cat1.strength = 5;

        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.weight = 4;
        cat2.strength = 3;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
