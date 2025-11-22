 import java.util.*;

// class Student {
//     String name;
//     int rollNo;

//     void inputDetails(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }
// }

// class Marks extends Student {
//     int m1, m2, m3;

//     void inputMarks(int m1, int m2, int m3) {
//         this.m1 = m1;
//         this.m2 = m2;
//         this.m3 = m3;
//     }

//     void displayResult() {
//         int total = m1 + m2 + m3;
//         double percentage = total / 3.0;
//         System.out.println("Name: " + name);
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Total Marks: " + total);
//         System.out.printf("Percentage: %.2f", percentage);
//     }
// }

// public class labQuestion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Marks obj = new Marks();
//         obj.inputDetails(sc.nextLine(), Integer.parseInt(sc.nextLine()));
//         obj.inputMarks(sc.nextInt(), sc.nextInt(), sc.nextInt());
//         obj.displayResult();
//     }
// }

// // employe salray
// import java.util.*;

// class Person {
//     String name;
//     int age;
// }

// class Employee extends Person {
//     String empId;
//     String designation;
// }

// class Salary extends Employee {
//     double basic, hra, da;

//     void calculateGross() {
//         double gross = basic + hra + da;
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("EmpID: " + empId);
//         System.out.println("Designation: " + designation);
//         System.out.println("Gross Salary: " + gross);
//     }
// }

// public class Exp2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Salary s = new Salary();
//         s.name = sc.nextLine();
//         s.age = sc.nextInt();
//         sc.nextLine();
//         s.empId = sc.nextLine();
//         s.designation = sc.nextLine();
//         s.basic = sc.nextDouble();
//         s.hra = sc.nextDouble();
//         s.da = sc.nextDouble();
//         s.calculateGross();
//     }
// }
// //
// import java.util.*;

// class Shape {
//     void displayArea() { }
// }

// class Circle extends Shape {
//     double r;
//     Circle(double r) { this.r = r; }
//     void displayArea() {
//         System.out.printf("Area of Circle: %.2f", 3.14 * r * r);
//     }
// }

// class Rectangle extends Shape {
//     double l, b;
//     Rectangle(double l, double b) { this.l = l; this.b = b; }
//     void displayArea() {
//         System.out.printf("Area of Rectangle: %.2f", l * b);
//     }
// }

// class Triangle extends Shape {
//     double b, h;
//     Triangle(double b, double h) { this.b = b; this.h = h; }
//     void displayArea() {
//         System.out.printf("Area of Triangle: %.2f", 0.5 * b * h);
//     }
// }

// public class Exp3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String shape = sc.nextLine();
//         if (shape.equalsIgnoreCase("Circle")) {
//             Circle c = new Circle(sc.nextDouble());
//             c.displayArea();
//         } else if (shape.equalsIgnoreCase("Rectangle")) {
//             Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
//             r.displayArea();
//         } else if (shape.equalsIgnoreCase("Triangle")) {
//             Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble());
//             t.displayArea();
//         }
//     }
// }
// // 
// import java.util.*;

// class Bank {
//     double getInterestRate() { return 0; }
// }

// class SBI extends Bank {
//     double getInterestRate() { return 6.5; }
// }

// class HDFC extends Bank {
//     double getInterestRate() { return 7.0; }
// }

// class ICICI extends Bank {
//     double getInterestRate() { return 6.8; }
// }

// public class Exp4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String bank = sc.nextLine();
//         Bank b;
//         if (bank.equalsIgnoreCase("SBI")) b = new SBI();
//         else if (bank.equalsIgnoreCase("HDFC")) b = new HDFC();
//         else b = new ICICI();
//         System.out.println(bank + " Interest Rate: " + b.getInterestRate() + "%");
//     }
// }
// //
// class Vehicle {
//     void start() {
//         System.out.println("Vehicle starting...");
//     }
// }

// class Car extends Vehicle {
//     void start() {
//         super.start();
//         System.out.println("Car engine started.");
//     }
// }

// public class Exp5 {
//     public static void main(String[] args) {
//         Car c = new Car();
//         c.start();
//     }
// }
