public class Display implements Observer {

  public void update(float temperature, float humidity, float pressure) {
    System.out.println(
      "Display: Temperature = " +
      temperature +
      "C, Humidity = " +
      humidity +
      "%"
    );
  }
}
