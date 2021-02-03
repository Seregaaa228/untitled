import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        Map<String, LocalDate> persons = new HashMap<>();


        persons.put("Grisha", LocalDate.of(1994, 12, 31));
        persons.put("Sasha", LocalDate.of(1999, 5, 21));
        persons.put("Anton", LocalDate.of(1972, 3, 15));
        persons.put("Pasha", LocalDate.of(1982, 6, 13));
        persons.put("Slava", LocalDate.of(1971, 8, 1));
        persons.put("Valera", LocalDate.of(1982, 6, 5));
        persons.put("Taras", LocalDate.of(1959, 2, 16));
        persons.put("Vova", LocalDate.of(1936, 6, 18));
        persons.put("Ruslan", LocalDate.of(1934, 11, 20));
        persons.put("Alexey", LocalDate.of(1966, 7, 28));
        List<String> keys = new ArrayList<>(persons.keySet());


        for (String key : keys) {

             persons.get(key);
            LocalDate value = persons.get(key);
            int month = value.getMonthValue();
            if(month >= 6 && month <= 8){
                persons.remove(key);

            }



        }
        System.out.println(persons.toString());


    }
}

