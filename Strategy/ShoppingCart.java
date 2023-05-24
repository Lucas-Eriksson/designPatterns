package Strategy;

//context class
public class ShoppingCart {

  private DiscountStrategy discountStrategy;

  public void setDiscountStrategy(DiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }

  public double calculateTotal(double amount) {
    double discount = discountStrategy.applyDiscount(amount);
    return amount - discount;
  }
}
