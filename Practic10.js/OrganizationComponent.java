public abstract class OrganizationComponent {
    protected String name;

    public abstract void Add(OrganizationComponent component);
    public abstract void Delete(OrganizationComponent component);
    public double GetSalary() {
        return 0;
    }
}
