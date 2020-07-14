package proxy.cglib;

public class TeacherDaoImpl {
    public TeacherDaoImpl teach(StringBuilder builder, String msg) {
        builder.append(msg);
        return this;
    }
}
