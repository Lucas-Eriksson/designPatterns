package Decorator;

public class Drinkable extends AddonDecorator {

  public Drinkable(Beverage bev) {
    super(bev);
  }

  @Override
  public String getDescription() {
    return bev.getDescription();
  }

  @Override
  public double getCost() {
    return bev.getCost();
  }

  public void drink() {
    System.out.println("You drank " + bev.getDescription() + ", tasty!");
  }
}
