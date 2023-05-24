package Template_method;

public class Main {

  public static void main(String[] args) {
    HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
    woodenHouseBuilder.buildHouse();

    System.out.println("------------------");

    HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
    brickHouseBuilder.buildHouse();
  }
}
