package proxy.cglib;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new TeacherDaoImpl());
        TeacherDaoImpl proxyInstance = (TeacherDaoImpl) factory.getProxyInstance();
        StringBuilder builder = new StringBuilder();
        proxyInstance.teach(builder, "开始第一课");
        proxyInstance.teach(builder, "开始第二课");
        proxyInstance.teach(builder, "开始第三课");
        System.out.println(builder.toString());
    }
}
