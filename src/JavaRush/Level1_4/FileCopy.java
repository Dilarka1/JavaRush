package JavaRush.Level1_4;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
    {
        public static void main(String[] args) throws IOException
        {
            FileInputStream fileInputStream = new FileInputStream("data.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("result.txt");

            while (fileInputStream.available() > 0)
            {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }

            fileInputStream.close();
            fileOutputStream.close();
        }
    }

