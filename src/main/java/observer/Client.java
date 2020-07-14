package observer;

/**
 * @author jiangzy
 * @date 2020/7/14 17:39
 */
public class Client {
    public static void main(String[] args) {
        Observer o1 = new Baidu();
        Observer o2 = new Sina();
        Observer o3 = new CurrentCondition();
        WeatherData subject = new WeatherData();
        subject.registerObserver(o1);
        subject.registerObserver(o2);
        subject.registerObserver(o3);
        subject.setTemperature(15.6F);
        subject.setPressure(17.3F);
        subject.setHumidity(80F);
        subject.notifyObservers();
        subject.setTemperature(10000F);
        subject.setPressure(10000F);
        subject.setHumidity(10000F);
        subject.notifyObservers();
    }
}
