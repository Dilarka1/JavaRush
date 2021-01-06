package JavaRush.Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек

Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

Требования:
•	Программа должна считывать имена 6 котов в указанном порядке.
•	Метод main должен создавать 6 объектов типа Cat.
•	Программа должна выводить 6 строк с информацией о котах.
•	Строка про дедушку (первая) должна соответствовать условию.
•	Строка про бабушку (вторая) должна соответствовать условию.
•	Строка про папу (третья) должна соответствовать условию.
•	Строка про маму (четвертая) должна соответствовать условию.
•	Строка про сына (пятая) должна соответствовать условию.
•	Строка про дочь (шестая) должна соответствовать условию.

*/

public class CatFamily {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        Cat catGrandPa = new Cat(grandPaName, null, null);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName, null, null);

        String papaName = reader.readLine();
        Cat catPapa = new Cat(papaName, null, catGrandPa);

        String mamaName = reader.readLine();
        Cat catMama = new Cat(mamaName, catGrandMa, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMama, catPapa);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMama, catPapa);


        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catPapa);
        System.out.println(catMama);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMama;
        private Cat parentPapa;


        public Cat(String name, Cat parentMama, Cat parentPapa) {
            this.name = name;
            this.parentMama = parentMama;
            this.parentPapa = parentPapa;
        }

        @Override
        public String toString() {

            String m = parentMama != null ? ", mother is " + parentMama.name : ", no mother";
            String f = parentPapa != null ? ", father is " + parentPapa.name : ", no father";
            return "The cat's name is " + name + m + f;
        }
    }
}