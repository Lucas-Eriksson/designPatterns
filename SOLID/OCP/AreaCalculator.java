package SOLID.OCP;

import java.util.*;

//AreaCalculator class responsible for calculating the total area of shapes
public class AreaCalculator {

  public double calculateTotalArea(List<Shape> shapes) {
    double totalArea = 0;
    for (Shape shape : shapes) {
      totalArea += shape.calculateArea();
    }
    return totalArea;
  }
}
