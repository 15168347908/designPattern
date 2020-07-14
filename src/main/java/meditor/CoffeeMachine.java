package meditor;

public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Meditor meditor, String name) {
        super(meditor, name);
        meditor.register(name, this);
    }

    void startCoffee(){

    }

    void finishCoffee(){
        System.out.println("After 5 minutes");
        System.out.println("Coffee is OK");
        sendMessage(0);
    }

    @Override
    public void sendMessage(int stateChange) {

    }
}
