abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
    @Override
    void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting...");
    }
    @Override
    void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.start();
        v.stop();

        v = new Bike();
        v.start();
        v.stop();
    }
}
