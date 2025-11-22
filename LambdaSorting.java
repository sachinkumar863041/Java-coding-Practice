import java.util.*;

public class LambdaSorting {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");

        // Sorting in reverse alphabetical order
        fruits.sort((a, b) -> b.compareTo(a));

        System.out.println("Sorted List in Reverse Order:");
        System.out.println(fruits);
    }
}
