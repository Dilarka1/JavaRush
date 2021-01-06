package printCollections;

import java.util.HashSet;
import java.util.Set;

public class PrintSet {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        for (String text : set)
        {
            System.out.println(text);
        }
    }
}
