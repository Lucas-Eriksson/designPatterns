package Template_method;

public abstract class HouseBuilder {

  public final void buildHouse() {
    constructFoundation();
    buildWalls();
    installWindows();
    paintHouse();
    decorateHouse();
    if (hasGarden()) {
      createGarden();
    }
    houseFinished();
  }

  protected abstract void constructFoundation();

  protected abstract void buildWalls();

  protected abstract void installWindows();

  protected abstract void paintHouse();

  protected abstract void decorateHouse();

  protected boolean hasGarden() {
    return false;
  }

  protected void createGarden() {
    //Default implementation for creating a garden
    System.out.println("Creating a garden");
  }

  protected abstract void houseFinished();
}
