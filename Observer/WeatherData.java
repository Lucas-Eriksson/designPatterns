import java.util.*;

public class WeatherData implements WeatherStation {

  private float temperature;
  private float humidity;
  private float pressure;
  private List<Observer> observers;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  public void setMeasurements(
    float temperature,
    float humidity,
    float pressure
  ) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObservers();
  }
}
