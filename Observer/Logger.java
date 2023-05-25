public class Logger implements Observer {

  public void update(float temperature, float humidity, float pressure) {
    System.out.println(
      "Logger: Recording weather data - Temperature = " +
      temperature +
      "C, Pressure = " +
      pressure +
      "hPa"
    );
  }
}
