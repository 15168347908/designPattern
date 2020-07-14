package bridge;

/**
 * @author 29677
 */
public abstract class AbstractPhone {
    private Brand brand;

    AbstractPhone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }

    public void close() {
        brand.close();
    }

}
