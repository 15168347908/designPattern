package composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import sun.security.krb5.internal.crypto.Des;

@Data
@AllArgsConstructor
public abstract class OrganizationComponent {
    private String name;
    private String des;

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected abstract void print();
}
