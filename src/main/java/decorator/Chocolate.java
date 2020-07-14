package decorator;

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setPrice(2.0f);
        setDes(" 巧克力 ");
    }
}
