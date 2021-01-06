package JavaRush.Level7;

import java.util.ArrayList;
import java.util.Arrays;

public class NewList9 {
    /*
Семейная перепись

Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать,
 трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться
при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
•	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
•	Выведи созданные объекты на экран.
*/

    public static void main(String[] args) {
        // напишите тут ваш код
        ArrayList<Human>family = new ArrayList<>();

        Human human = new Human("Василий", true, 60);
        family.add(human);
        Human human1 = new Human("Мария", false, 59);
        family.add(human1);
        Human human2 = new Human("Николай", true, 65);
        family.add(human2);
        Human human3 = new Human("Дарья", false, 65);
        family.add(human3);

        Human human4 = new Human("Александр", true, 35, human, human1);
        family.add(human4);
        Human human5 = new Human("Анна", false, 34, human2, human3);
        family.add(human5);

        Human human6 = new Human("Дима", true, 9, human4, human5);
        family.add(human6);
        Human human7 = new Human("Лена", false, 6, human4, human5);
        family.add(human7);
        Human human8 = new Human("Сеня", true, 2, human4, human5);
        family.add(human8);


        //for (int i = 0; i < 8; i++) {
          for( Human fullFamily : family){
              System.out.println(fullFamily.toString());
          }
//        System.out.println(human.toString());
//        System.out.println(human2.toString());
//        System.out.println(human3.toString());
//        System.out.println(human4.toString());
//        System.out.println(human5.toString());
//        System.out.println(human6.toString());
//        System.out.println(human7.toString());
//        System.out.println(human8.toString());

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
