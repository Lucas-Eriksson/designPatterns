package SOLID.DIP;

//High-level module
public class DeliveryService {

  private PaymentGateway paymentGateway;

  //Dependency is injected through the constructor
  public DeliveryService(PaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public void deliverPackage(String packageID, double amount) {
    //Code for delivering the package
    System.out.println("Delivering package " + packageID);

    //Process payment using the PaymentGateway abstraction
    paymentGateway.processPayment(amount);

    //Code for completing the delivery process
    System.out.println("Package " + packageID + " delivered successfully!");
  }
}
