package JavaRush.Level15;

public class Solution01 {

    /*
ООП - Наследование животных

Давай создадим классы животных и определим их размер, унаследовав их от правильных классах.
Для этого:
Создай public static класс Goose (Гусь).
Создай public static класс Dragon (Дракон).
Унаследуй класс Goose от BigAnimal или SmallAnimal, подумай, какой логически больше подходит.
Унаследуй класс Dragon от BigAnimal или SmallAnimal, подумай, какой логически больше подходит.
В классах Goose и Dragon переопредели метод String getSize(), расширь видимость
до максимальной.
В классе Goose метод getSize должен возвращать строку
"Гусь маленький, " + [getSize родительского класса].
В классе Dragon метод getSize должен возвращать строку
"Дракон большой, " + [getSize родительского класса].

Требования:
Класс Goose должен быть создан внутри класса Solution и быть статическим.
Класс Dragon должен быть создан внутри класса Solution и быть статическим.
Класс Goose должен быть потомком класса SmallAnimal.
Класс Dragon должен быть потомком класса BigAnimal.
В классе Goose должен быть переопределен метод getSize, который должен возвращать
строку формата "Гусь маленький, " + [getSize родительского класса].
В классе Dragon должен быть переопределен метод getSize, который должен возвращать
строку формата "Дракон большой, " + [getSize родительского класса].
Область видимости переопределенных методов getSize в классах Goose и Dragon нужно
 расширить до максимальной.
*/
    //добавьте классы Goose и Dragon тут

    public static void main(String[] args) {
        System.out.println(new Dragon().getSize());
        System.out.println(new Goose().getSize());

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }

    public static class Goose extends SmallAnimal {
        public String getSize() {
            return "Гусь маленький, " + super.getSize() + ".";
        }

    }

    public static class Dragon extends BigAnimal {
        public String getSize() {
            return "Дракон большой, " + super.getSize() + ".";
        }
    }
}