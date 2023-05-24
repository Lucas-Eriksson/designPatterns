package Decorator;

public class main {

  public static void main(String[] args) {
    Beverage bev = new Latte();
    System.out.println(bev.getDescription() + " $" + bev.getCost());

    AddonDecorator caramel = new Caramel(bev);
    System.out.println(caramel.getDescription() + " $" + caramel.getCost());

    Drinkable drink = new Drinkable(caramel);

    drink.drink();
  }
}
