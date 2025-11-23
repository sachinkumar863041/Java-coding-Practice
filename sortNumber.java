import java.Util.Scanner;
public class sortNUmber{
public static void sortNumbers() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        numbers.add(sc.nextInt());
    }

    Collections.sort(numbers);
    System.out.println("Ascending: " + numbers);

    Collections.sort(numbers, Collections.reverseOrder());
    System.out.println("Descending: " + numbers);
}
}