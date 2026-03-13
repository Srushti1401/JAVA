package ClassesObjects;

class Payment{
    void processPayment(double amount){
        System.out.println("Processing payment");
    }
}

class CreditCardPayment extends Payment{
    void processPayment(double amount){
        System.out.println("Credit Card Payment "+amount);
    }
}

class UPIPayment extends Payment{
    void processPayment(double amount){
        System.out.println("UPI Payment "+amount);
    }
}

public class Polymorphism{
    public static void main(String[] args){
        Payment p;

        p=new CreditCardPayment();
        p.processPayment(2000);

        p=new UPIPayment();
        p.processPayment(1500);
    }
}