import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components;

    public Department() {
        components = new ArrayList<>();
    }

    @Override
    public void Add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void Delete(OrganizationComponent component) {
        components.remove(component);
    }

    public double GetSalary() {
        return components.stream().mapToDouble(OrganizationComponent::GetSalary).sum();
    }

    public int GetCount() {
        return components.size();
    }
}
