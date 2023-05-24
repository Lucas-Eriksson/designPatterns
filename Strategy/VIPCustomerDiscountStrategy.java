package Strategy;

//concrete strategy class
public class VIPCustomerDiscountStrategy implements DiscountStrategy {

  @Override
  public double applyDiscount(double amount) {
    //Apply VIP customer discount logic
    return amount * 0.3; //30%
  }
}
