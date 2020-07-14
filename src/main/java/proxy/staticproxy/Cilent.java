package proxy.staticproxy;

public class Cilent {
    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDaoImpl());
        proxy.teach();
    }
}
