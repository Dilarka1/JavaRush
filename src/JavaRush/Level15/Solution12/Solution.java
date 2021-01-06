package JavaRush.Level15.Solution12;

/*
Template pattern

В этой задаче тебе нужно:
В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
void getRightCup() - выбрать подходящую чашку;
void putIngredient() - положить ингредиенты;
void pour() - залить жидкость.
В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в
такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкость.
В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker.
Распределить следующие фразы между всеми методами в классах LatteMaker и TeaMaker:
"Заливаем кипятком"
"Берем чашку для латте"
"Насыпаем чай"
"Берем чашку для чая"
"Заливаем молоком с пенкой"
"Делаем кофе"
Каждый метод должен выводить в консоль свою фразу, не пересекаясь с другими методами.

Требования:
•	Класс DrinkMaker должен быть создан в отдельном файле и быть абстрактным.
•	В классе DrinkMaker должны содержаться объявления трех абстрактных методов getRightCup(),
putIngredient() и pour().
•	В классе DrinkMaker должен быть реализован метод makeDrink(), который будет вызывать
абстрактные методы этого класса в последовательности, заданной условием.
•	Класс LatteMaker должен быть создан в отдельном файле и быть потомком класса DrinkMaker.
•	Класс TeaMaker должен быть создан в отдельном файле и быть потомком класса DrinkMaker.
•	Метод getRightCup() в классе LatteMaker должен выводить на экран фразу "Берем чашку для латте".
•	Метод putIngredient() в классе LatteMaker должен выводить на экран фразу "Делаем кофе".
•	Метод pour() в классе LatteMaker должен выводить на экран фразу "Заливаем молоком с пенкой".
•	Метод getRightCup() в классе TeaMaker должен выводить на экран фразу "Берем чашку для чая".
•	Метод putIngredient() в классе TeaMaker должен выводить на экран фразу "Насыпаем чай".
•	Метод pour() в классе TeaMaker должен выводить на экран фразу "Заливаем кипятком".
*/

public class Solution {
    public static void main(String[] args) {


    }
}
