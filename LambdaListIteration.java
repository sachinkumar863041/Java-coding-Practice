import java.util.*;

public class LambdaListIteration {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amit", "Ravi", "Priya");

        // Using lambda with forEach
        names.forEach(name -> System.out.println(name));
    }
}
