package Decorator;

public class Caramel extends AddonDecorator {

  public Caramel(Beverage bev) {
    super(bev);
  }

  @Override
  public String getDescription() {
    return bev.getDescription() + ", Caramel";
  }

  @Override
  public double getCost() {
    return bev.getCost() + 0.2;
  }
}
