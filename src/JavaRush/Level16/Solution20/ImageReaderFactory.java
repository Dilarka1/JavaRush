package JavaRush.Level16.Solution20;

import JavaRush.Level16.Solution20.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {

     //   ImageReader reader = null;

        if ((ImageTypes.JPG).equals(types)) {
            return new JpgReader();
        }
        if ((ImageTypes.BMP).equals(types)) {
            return new BmpReader();
        }
        if ((ImageTypes.PNG).equals(types)) {
            return new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}