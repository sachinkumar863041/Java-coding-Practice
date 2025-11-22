import java.util.*;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Constructer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        b.displayDetails();
    }
}
