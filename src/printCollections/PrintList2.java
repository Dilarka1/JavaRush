package printCollections;

import java.util.ArrayList;
import java.util.List;

public class PrintList2 {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        for (String text : list)
        {
            System.out.println(text);
        }
    }
}
