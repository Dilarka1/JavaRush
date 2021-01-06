package JavaRush.Level8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Block_217 {
    /*
Собираем семейство

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
•	Программа должна выводить текст на экран.
•	Класс Human должен содержать четыре поля.
•	Класс Human должен содержать один метод.
•	Класс Solution должен содержать один метод.
•	Программа должна создавать объекты и заполнять их так, чтобы получилось:
два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<Human> people = new ArrayList<>();

        ArrayList<Human> children = new ArrayList<>();
        Human kid1 = new Human("Johnny", true, 3);
        Human kid2 = new Human("Cooper", true, 10);
        Human kid3 = new Human("Emma", false, 15);
        children.add(kid1);
        children.add(kid2);
        children.add(kid3);

        ArrayList<Human> parent1 = new ArrayList<>();
        ArrayList<Human> parent2 = new ArrayList<>();
        Human daddy = new Human("Tomas", true, 40, children);
        Human mommy = new Human("Ashley", false, 40, children);
        parent1.add(daddy);
        parent2.add(mommy);

        ArrayList<Human> family = new ArrayList<>();
        Human papa1 = new Human("Jackson", true, 70, parent1);
        Human nana1 = new Human("Jessica", false, 68, parent1);
        family.add(papa1);
        family.add(nana1);

        Human papa2 = new Human("Donald", true, 69, new ArrayList<Human>(Arrays.asList(mommy)));
        Human nana2 = new Human("Cindy", false, 65, new ArrayList<Human>(Arrays.asList(mommy)));
        family.add(papa2);
        family.add(nana2);

        System.out.println(papa1);
        System.out.println(papa2);

        System.out.println(nana1);
        System.out.println(nana2);

        System.out.println(daddy);
        System.out.println(mommy);

        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}