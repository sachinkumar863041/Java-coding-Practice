public class LambdaThread {
    public static void main(String[] args) {

        // Creating a thread using lambda
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from Thread");
            }
        };

        Thread t = new Thread(task);
        t.start();
    }
}
