public class Main {
    public static void main(String[] args) {
        //Create the subject
        WeatherData weatherData = new WeatherData();

        //Create observers
        Display display = new Display();
        Logger logger = new Logger();

        //Register observers with the subject
        weatherData.addObserver(display);
        weatherData.addObserver(logger);

        //Simulate wather measurements
        weatherData.setMeasurements(25.5f, 70.2f, 1013.2f);
        weatherData.setMeasurements(24.8f, 68.5f, 1012.5f);
    }
}
