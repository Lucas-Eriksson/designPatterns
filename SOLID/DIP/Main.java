package SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        //Create instances of payment gateways
        PaymentGateway creditCardGateway = new CreditCardPaymentGateway();
        PaymentGateway paypalGateway = new PayPalPaymentGateway();

        // Create an instance of DeliveryService and inject the payment gateway
        DeliveryService deliveryService = new DeliveryService(creditCardGateway);
        deliveryService.deliverPackage("12345", 100.0);

        // Change the payment gateway dynamically
        deliveryService = new DeliveryService(paypalGateway);
        deliveryService.deliverPackage("67890", 200.0);
    }
}
