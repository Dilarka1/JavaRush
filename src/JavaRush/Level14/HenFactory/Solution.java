package JavaRush.Level14.HenFactory;

/*
Куриная фабрика

Давай напишем Фабрику (Factory) по производству кур (Hen):
Создай класс Hen.
Сделай его абстрактным.
Добавь в класс абстрактный метод int getCountOfEggsPerMonth().
Добавь в класс метод String getDescription(), который возвращает строку "Я - курица.".
Создай класс RussianHen, который наследуется от Hen.
Создай класс UkrainianHen, который наследуется от Hen.
Создай класс MoldovanHen, который наследуется от Hen.
Создай класс BelarusianHen, который наследуется от Hen.
В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
В каждом из четырех последних классов напиши свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

В классе HenFactory реализуй метод getHen, который возвращает соответствующую стране породу кур.
Все созданные классы должны быть в отдельных файлах.

Требования:
•	Класс Hen должен быть абстрактным.
•	Класс Hen должен содержать абстрактный метод int getCountOfEggsPerMonth().
•	В классе Hen должен быть реализован метод String getDescription(), который возвращает
строку "Я - курица.".
•	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны наследоваться от
 класса Hen и быть созданы в отдельных файлах.
•	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны реализовывать
метод getCountOfEggsPerMonth, который должен возвращать количество яиц в месяц от данного
типа куриц.
•	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны переопределять
метод getDescription родительского класса таким образом, чтобы возвращаемая ими строка
имела вид: <getDescription() родительского класса> + < Моя страна - Sssss. Я несу N яиц
 в месяц.> где Sssss - название страны, а N - количество яиц в месяц.
•	Метод getHen должен быть реализован в классе HenFactory и возвращать тип кур для
переданной в него страны.
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код

            if(country.equals(Country.RUSSIA)){
                hen = new RussianHen();
            }
            if(country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            }
            if(country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
            }
            if(country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            }
            return hen;
        }
    }
}