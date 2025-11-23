import java.util.*;

public class StudentMap {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Insert entries
        map.put(101, "Aman");
        map.put(102, "Priya");
        map.put(103, "Ravi");
        map.put(104, "John");
        map.put(105, "Meera");

        // Display all key-value pairs
        System.out.println("Student Details:");
        System.out.println(map);

        // Search for a roll number
        int searchRoll = 102;

        if (map.containsKey(searchRoll)) {
            System.out.println("Found: " + map.get(searchRoll));
        } else {
            System.out.println("Roll Number Not Found!");
        }
    }
}
