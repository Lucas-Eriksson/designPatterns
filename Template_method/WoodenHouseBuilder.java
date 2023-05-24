package Template_method;

public class WoodenHouseBuilder extends HouseBuilder {

  @Override
  protected void constructFoundation() {
    System.out.println("Constructing wooden foundation");
  }

  @Override
  protected void buildWalls() {
    System.out.println("Building wooden walls");
  }

  @Override
  protected void installWindows() {
    System.out.println("Installing wooden windows");
  }

  @Override
  protected void paintHouse() {
    System.out.println("Painting wooden house");
  }

  @Override
  protected void decorateHouse() {
    System.out.println("Decorating wooden house");
  }

  @Override
  protected boolean hasGarden() {
    return true;
  }

  @Override
  protected void houseFinished() {
    System.out.println("Wooden house finished, congratulations!");
  }
}
