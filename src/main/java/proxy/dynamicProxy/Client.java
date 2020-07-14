package proxy.dynamicProxy;

public class Client {

    public static void main(String[] args) {
        ProxyFactory proxy = new ProxyFactory(new TeacherDaoImpl());
        ITeacherDao target = (ITeacherDao) proxy.getProxyInstance();
        StringBuilder builder = new StringBuilder();
        ITeacherDao teach = target.teach(builder, "开始上课\n")
                .teach(builder, "第一课 如何做个人\n")
                .teach(builder, "第二课 如何过一生\n")
                .teach(builder, "第三课 如何做抉择");
        System.out.println(teach.getClass());
        System.out.println(builder.toString());
    }
}
