package prototype;

import entity.Employee;
import entity.IDCard;

import java.io.*;

/**
 * @author jzy
 * @date 2020-6-13
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.setIdCard(new IDCard("16546"));
        Employee deepCloneObj = employee.deepClone();
        Employee cloneObj = employee.clone();
        System.out.println(deepCloneObj.getIdCard() == cloneObj.getIdCard());
    }
}
