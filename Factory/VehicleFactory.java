package Factory;

public class VehicleFactory {
    public Vehicle createVehicle (String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        }
        throw new IllegalArgumentException("Invalid vehicle type: " + type);
    }
}