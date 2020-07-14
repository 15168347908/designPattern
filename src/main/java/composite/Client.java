package composite;

import sun.management.counter.Units;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("宁波财经学院", "这是我的母校");
        OrganizationComponent college1 = new College("金融信息学院", "这是我所在的学院");
        OrganizationComponent college2 = new College("机电学院", "我隔壁的学院");
        college1.add(new Department("学生会", "不知道干啥的"));
        college1.add(new Department("党员会", "不知道干啥的"));
        university.add(college1);
        university.add(college2);
        university.print();
    }
}
