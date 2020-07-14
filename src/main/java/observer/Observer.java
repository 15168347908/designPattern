package observer;

/**
 * @author jiangzy
 * @date 2020/7/14 10:36
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);
}
