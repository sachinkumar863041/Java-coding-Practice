import java.util.*;

class Car {
    String brand;
    String model;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.nextLine();
        String model = sc.nextLine();

        Car c = new Car(brand, model);
        c.display();
    }
}
