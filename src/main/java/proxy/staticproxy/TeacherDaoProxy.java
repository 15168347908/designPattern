package proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao {
    private final ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public void teach() {
        System.out.println("教学之前");
        teacherDao.teach();
        System.out.println("教学完成");
    }

}
