package observer;

/**
 * @author jiangzy
 * @date 2020/7/14 10:34
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
