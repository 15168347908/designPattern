package visitor;

public class Client {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());

        structure.display(new Success());

        structure.display(new Fail());
    }
}
