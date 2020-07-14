package iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator<Department> {

    private List<Department> departments;
    private int index;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return index++ < departments.size() - 1;
    }

    @Override
    public Department next() {
        return departments.get(index);
    }
}
