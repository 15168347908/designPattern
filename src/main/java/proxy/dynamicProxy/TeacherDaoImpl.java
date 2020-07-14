package proxy.dynamicProxy;

public class TeacherDaoImpl implements ITeacherDao {
    @Override
    public ITeacherDao teach(StringBuilder builder, String msg) {
        builder.append(msg);
        return this;
    }
}
