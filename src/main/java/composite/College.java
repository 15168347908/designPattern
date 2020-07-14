package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    List<OrganizationComponent> ocs = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        ocs.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        ocs.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("\t----------" + getName() + "-----------");
        for (OrganizationComponent oc : ocs) {
            oc.print();
        }
    }
}
