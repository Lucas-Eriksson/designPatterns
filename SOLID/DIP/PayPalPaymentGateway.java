package SOLID.DIP;

//Implementation of PaymentGateway for PayPal payments
public class PayPalPaymentGateway implements PaymentGateway {
    public void processPayment(double amount) {
        //Code for processing PayPal payment
        System.out.println("Processing PayPal payment for $" + amount);
    }
}
