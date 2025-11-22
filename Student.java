import java.util.*;

class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.setName(sc.nextLine());
        s.setMarks(sc.nextInt());

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}
