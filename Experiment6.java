public class Experiment6 {

    public static int divideNumbers(int num, int den) {
        try {
            return num / den;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            return -1;
        }
    }

    public static void main(String[] args) {
        int result = divideNumbers(10, 0);
    }
}
