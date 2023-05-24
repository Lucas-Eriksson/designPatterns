package Template_method;

public class BrickHouseBuilder extends HouseBuilder {

  @Override
  protected void constructFoundation() {
    System.out.println("Constructing brick foundation");
  }

  @Override
  protected void buildWalls() {
    System.out.println("Building brick walls");
  }

  @Override
  protected void installWindows() {
    System.out.println("Installing glass windows");
  }

  @Override
  protected void paintHouse() {
    System.out.println("Painting brick house");
  }

  @Override
  protected void decorateHouse() {
    System.out.println("Decorating brick house");
  }

  @Override
  protected void houseFinished() {
    System.out.println("Brick house finished, congratulations!");
  }
}
