package JavaRush.Level8;

import java.util.ArrayList;

public class Block_217_2 {

    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<Human> children = new ArrayList<>();

        children.add(new Human("Cild1", false, 12));
        children.add(new Human("child2", true, 11));
        children.add(new Human("child3", true, 15));

        ArrayList<Human> parentMother = new ArrayList<>();
        ArrayList<Human> parentFather = new ArrayList<>();

        parentFather.add(new Human("Father", true, 35, children));
        parentMother.add(new Human("Mother", false, 32, children));

        ArrayList<Human> buneluTatei = new ArrayList<>();
        ArrayList<Human> bunicaTatei = new ArrayList<>();

        ArrayList<Human> buneluMamei = new ArrayList<>();
        ArrayList<Human> bunicaMamei = new ArrayList<>();

        buneluTatei.add(new Human("Bunelu din partea lui tata", true, 58, parentFather));
        buneluMamei.add(new Human("Bunelul din partea lui mama", true, 62, parentMother));

        bunicaMamei.add(new Human("Bunica din partea mamei", false, 56, parentMother));
        bunicaTatei.add(new Human("Bunica din partea tatei", false, 58, parentFather));


        System.out.println(buneluTatei.toString());
        System.out.println(buneluMamei.toString());
        System.out.println(bunicaTatei.toString());
        System.out.println(bunicaMamei.toString());

        System.out.println(parentFather.toString());
        System.out.println(parentMother.toString());

        System.out.println(children.get(0).toString());
        System.out.println(children.get(1).toString());
        System.out.println(children.get(2).toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
        public Human(String name, boolean sex, int age){
            this(name,sex,age,null);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.children != null) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }
}
