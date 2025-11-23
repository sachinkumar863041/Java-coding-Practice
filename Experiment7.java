import java.util.InputMismatchException;

public class Experiment7 {

    public static void storeValue(int[] arr, int index, int value) {
        try {
            arr[index] = value;
            System.out.println("Value stored successfully.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type.");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[3];
        storeValue(array, 5, 10);
    }
}
