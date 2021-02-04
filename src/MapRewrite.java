import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapRewrite {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите город и фамилию");
        Map<String, String> persons = new HashMap<>();
        while (true) {
            String temp = reader.readLine();
            String temp2 = reader.readLine();
            if (temp.equals("") || temp2.equals("")) {
                System.out.println("Введите город");
                break;
            } else {
                persons.put(temp, temp2);
                System.out.println("Перепись сделана");

            }

        }
        String town = reader.readLine();

        if (persons.containsKey(town)) {
            System.out.println("Житель города" + persons.get(town));

        }






    }
}


