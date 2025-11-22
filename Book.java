class Rectangle {
    private double length;
    private double breadth;

    // Default Constructor
    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized Constructor
    public Rectangle(double length, double breadth) {
        if(length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Invalid dimensions");
        }
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Area: " + r1.calculateArea());

        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("Area: " + r2.calculateArea());
    }
}
