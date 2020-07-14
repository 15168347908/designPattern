package observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangzy
 * @date 2020/7/14 10:37
 */
@Data
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this.temperature, this.pressure, this.humidity));
    }
}
