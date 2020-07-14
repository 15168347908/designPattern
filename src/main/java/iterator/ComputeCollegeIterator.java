package iterator;

import java.util.Iterator;

public class ComputeCollegeIterator implements Iterator<Department> {
    private Department[] departments;
    private int index = 0;

    public ComputeCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return index++ < departments.length - 1;
    }

    @Override
    public Department next() {
        return departments[index];
    }
}
