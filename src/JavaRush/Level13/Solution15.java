package JavaRush.Level13;

public class Solution15 {
    /*
Том, Джерри и Спайк

Создай классы Dog, Cat и Mouse.
Реализуй интерфейсы в добавленных классах, учитывая что:

Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
Мышь (Mouse) может передвигаться, и ее могут съесть;
Собака (Dog) может передвигаться и съесть кого-то.

Требования:
•	Класс Cat должен быть объявлен внутри класса Solution.
•	Класс Dog должен быть объявлен внутри класса Solution.
•	Класс Mouse должен быть объявлен внутри класса Solution.
•	Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
•	Мышь (Mouse) может передвигаться и может быть съедена.
•	Собака (Dog) может передвигаться и съесть кого-то.
*/

    public static void main(String[] args) {

    }

    public class Cat implements Movable, Eat, Edible {
        public void move() {
        }

        public void eat() {
        }

        public void beEaten() {
        }
    }

    public class Dog implements Movable, Eat{
        public void eat() {
        }

        public void move() {
        }
    }

    public class Mouse implements Movable, Edible{
        public void beEaten() {
        }

        public void move() {
        }
    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
}