public class Experiment9 {

    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) throws Exception {
        validateAge(15);
    }
}
