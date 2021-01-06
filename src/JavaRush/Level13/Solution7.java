package JavaRush.Level13;

public class Solution7 {
    /*
Больше не Пушистик

Переопредели метод setName в классе Cat так, чтобы программа
выдавала на экран надпись «Я - кот».

Требования:
•	Класс Solution должен содержать класс Pet.
•	Класс Solution должен содержать класс Cat.
•	Класс Cat должен наследоваться от класса Pet.
•	Класс Pet должен содержать два метода getName() и setName().
•	Класс Cat должен переопределять метод setName().
•	Программа должна выводить на экран результат метода getName() объекта pet.
*/


    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        Pet pet2 = new Cat();
        pet2.setName("Я - кот");

        System.out.println(pet2.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Pet {
        public void setName(String name) {
            this.name = name;
        }
    }
}