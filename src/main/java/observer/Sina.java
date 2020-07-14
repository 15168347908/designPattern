package observer;

/**
 * @author jiangzy
 * @date 2020/7/14 17:38
 */
public class Sina implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println("CurrentCondition 更新了数据,temperature = " + temperature + ",pressure = " + pressure + ",humidity = " + humidity);
    }
}
