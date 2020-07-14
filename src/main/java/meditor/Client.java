package meditor;

public class Client {
    public static void main(String[] args) {
        Meditor meditor = new ConcreteMeditor();
        Alarm alarm = new Alarm(meditor, "alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(meditor, "curtains");
        Curtains curtains = new Curtains(meditor, "curtains");
        TV tv = new TV(meditor, "TV");
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
