import java.util.*;
import java.util.stream.*;

public class SortHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // Sort by Keys
        Map<Integer, String> sortedByKey =
                new TreeMap<>(map);
        System.out.println("Sorted by Key: " + sortedByKey);

        // Sort by Values
        Map<Integer, String> sortedByValue =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByValue())
                   .collect(Collectors.toMap(
                           Map.Entry::getKey,
                           Map.Entry::getValue,
                           (e1, e2) -> e1,
                           LinkedHashMap::new
                   ));
        System.out.println("Sorted by Value: " + sortedByValue);
    }
}
