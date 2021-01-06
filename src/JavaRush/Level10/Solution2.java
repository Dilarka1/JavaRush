package JavaRush.Level10;

/*
Конструкторы класса Human
*/
public class Solution2 {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private int weight;
        private int height;
        private String name;
        private String race;
        private String profession;

        public Human(int age, int weight, int height, String name, String race, String profession) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
            this.race = race;
            this.profession = profession;
        }

        public Human(int age, int weight, int height, String name, String race) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
            this.race = race;
        }

        public Human(int age, int weight, int height, String name) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String profession) {
            this.profession = profession;
        }

        public Human(String race, String profession) {
            this.race = race;
            this.profession = profession;
        }

        public Human(String name, String race, String profession) {
            this.name = name;
            this.race = race;
            this.profession = profession;
        }

        public Human() {

        }
    }
}