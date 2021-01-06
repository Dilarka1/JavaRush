package JavaRush.Level5;

public class Cat_constr {
    /*
Кошкоинициация
*/
        //напишите тут ваш код
        String name;
        int age = 4;
        int weight = 5;
        String address = null;
        String color = "grey";

        public void initialize (String name){
            this.name = name;
            this.age = 3;
            this.weight = 5;
            this.color = color;
            this.address = null;
        }

        public void initialize(String name, int weight, int age){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
            this.address = null;
        }

        public void initialize(String name, int age){
            this.name = name;
            this.age = 3;
            this.weight = 5;
            this.color = color;
            this.address = null;
        }

        public void initialize(int weight, String color){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
            this.address = address;
        }

        public void initialize (int weight, String color,String address){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
            this.address = address;
        }

        public static void main(String[] args) {

        }

}
