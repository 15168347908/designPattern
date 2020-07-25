package chain;

public class Client {
    public static void main(String[] args) {
        Approver department = new Department("老王");
        Approver viceMaster = new ViceMaster("老李");
        Approver master = new Master("老黑");

        department.setApprover(viceMaster);
        viceMaster.setApprover(master);
        master.setApprover(department);

        Request request = new Request(300000f);
        department.handleRequest(request);

        request = new Request(1000);
        department.handleRequest(request);

        request = new Request(5000);
        department.handleRequest(request);
    }
}
