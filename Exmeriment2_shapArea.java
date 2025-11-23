interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;
    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }
    public double area() {
        return length * breadth;
    }
}

public class Exmeriment2_shapArea {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        System.out.println("Area of Circle: " + s1.area());

        Shape s2 = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + s2.area());
    }
}
