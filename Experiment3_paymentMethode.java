abstract class Payment {
    abstract void payAmount(double amount);
}

interface Refundable {
    void refundAmount(double amount);
}

class CreditCardPayment extends Payment implements Refundable {
    public void payAmount(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
    public void refundAmount(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

class UPIPayment extends Payment implements Refundable {
    public void payAmount(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
    public void refundAmount(double amount) {
        System.out.println("Refunded " + amount + " to UPI");
    }
}

public class Experiment3_PaymentMethode {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.payAmount(1000);
        ((Refundable)p).refundAmount(1000);

        p = new UPIPayment();
        p.payAmount(500);
        ((Refundable)p).refundAmount(500);
    }
}
