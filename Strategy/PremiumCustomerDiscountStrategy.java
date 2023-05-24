package Strategy;

//Concrete strategy class
public class PremiumCustomerDiscountStrategy implements DiscountStrategy {

  @Override
  public double applyDiscount(double amount) {
    //Apply premium customer discount logic
    return amount * 0.2; //20%
  }
}
