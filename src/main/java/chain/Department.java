package chain;

public class Department extends Approver {

    public Department(String name) {
        this.setName(name);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getPrice() <= 1000) {
            System.out.println("金额 = " + request.getPrice() + " 被" + this.getName() + "审核完成");
        } else {
            getApprover().handleRequest(request);
        }
    }
}
