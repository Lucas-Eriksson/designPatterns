package SOLID.OCP;

//Concrete implementation of a shape: Rectangle
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
