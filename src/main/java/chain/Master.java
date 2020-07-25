package chain;

public class Master extends Approver {

    public Master(String name) {
        this.setName(name);
    }


    @Override
    public void handleRequest(Request request) {
        if (request.getPrice() >= 10000) {
            System.out.println("金额 = " + request.getPrice() + " 被" + this.getName() + "审核完成");
        } else {
            getApprover().handleRequest(request);
        }
    }
}
