public class Employee extends OrganizationComponent {
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void Add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void Delete(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double GetSalary() {
        return salary;
    }
}
