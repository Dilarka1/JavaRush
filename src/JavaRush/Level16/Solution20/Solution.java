package JavaRush.Level16.Solution20;

/*
Factory method pattern

1. Внимательно посмотри, какие классы у тебя есть.
2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader, которые
реализуют интерфейс ImageReader.
3. В отдельном файле в основном пакете создай класс ImageReaderFactory с одним методом.
3.1. Подумай, как он должен называться.
3.2. Подумай, какие модификаторы должны быть у этого метода.
4. Этот метод должен:
4.1. Для каждого значения из ImageTypes возвращать соответствующий Reader, например, для
 ImageTypes.JPG - JpgReader;
4.2. Если передан неправильный параметр, то выбрасывать исключение
IllegalArgumentException("Неизвестный тип картинки").

Требования:
•	Создай в пакете common класс JpgReader, реализующий интерфейс ImageReader.
•	Создай в пакете common класс PngReader, реализующий интерфейс ImageReader.
•	Создай в пакете common класс BmpReader, реализующий интерфейс ImageReader.
•	Создай публичный класс ImageReaderFactory.
•	Добавь в класс ImageReaderFactory открытый статический метод getImageReader с параметром ImageTypes.
•	Метод getImageReader должен создавать и возвращать подходящий Reader.
•	Метод getImageReader должен кидать исключение IllegalArgumentException, если передан
 неправильный параметр.
*/

import JavaRush.Level16.Solution20.common.ImageReader;
import JavaRush.Level16.Solution20.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
