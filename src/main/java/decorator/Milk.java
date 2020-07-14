package decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setPrice(1.0f);
        setDes(" 牛奶 ");
    }
}
