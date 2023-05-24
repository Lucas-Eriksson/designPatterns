package Strategy;

public class Main {

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    // Regular customer
    DiscountStrategy regularStrategy = new RegularCustomerDiscountStrategy();
    cart.setDiscountStrategy(regularStrategy);
    double regularTotal = cart.calculateTotal(100.0);
    System.out.println("Regular customer total: $" + regularTotal);

    // Premium customer
    DiscountStrategy premiumStrategy = new PremiumCustomerDiscountStrategy();
    cart.setDiscountStrategy(premiumStrategy);
    double premiumTotal = cart.calculateTotal(100.0);
    System.out.println("Premium customer total: $" + premiumTotal);

    // VIP customer
    DiscountStrategy vipStrategy = new VIPCustomerDiscountStrategy();
    cart.setDiscountStrategy(vipStrategy);
    double vipTotal = cart.calculateTotal(100.0);
    System.out.println("VIP customer total: $" + vipTotal);
  }
}
