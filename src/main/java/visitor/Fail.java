package visitor;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人觉得不行");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人觉得不行");
    }
}
