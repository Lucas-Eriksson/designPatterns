package SOLID.DIP;

//Implementation of PaymentGateqay for credit card payments
public class CreditCardPaymentGateway implements PaymentGateway {
    public void processPayment(double amount) {
        //Code for processing credit card payment
        System.out.println("Processing credit card payment for $" + amount);
    }
}
