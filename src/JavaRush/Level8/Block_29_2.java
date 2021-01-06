package JavaRush.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Block_29_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> addresses = new HashMap<String, String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.put(city, family);
        }

        //read home number
        String houseCity = reader.readLine();

        Iterator<Map.Entry<String, String>> iterator = addresses.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> addr = iterator.next();
            String keyCity = addr.getKey();
            String valueName = addr.getValue();

            if (keyCity.equals(houseCity))
                System.out.println(valueName);
        }
    }
}