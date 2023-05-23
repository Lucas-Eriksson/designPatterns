package Factory;

public class Example {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("car");
        car.drive();

        Vehicle motorcycle = factory.createVehicle("motorcycle");
        motorcycle.drive();

        Vehicle invalidVehicle = factory.createVehicle("truck");
    }
}
