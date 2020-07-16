package memento;

/**
 * @author jiangzy
 * @date 2020/7/16 10:50
 */
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        String state1 = "状态1 攻击力 100";
        originator.setState(state1);
        caretaker.save(originator.saveStateMemento());

        String state2 = "状态2 攻击力 80";
        originator.setState(state2);
        caretaker.save(originator.saveStateMemento());

        String state3 = "状态3 攻击力 50";
        originator.setState(state3);
        caretaker.save(originator.saveStateMemento());

        System.out.println("当前当前状态 current = " + originator.getState());

        originator.setStateFromMemento(caretaker.get(state1));
        System.out.println("当前当前状态 current = " + originator.getState());
    }
}
