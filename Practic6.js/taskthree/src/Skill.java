public class Skill implements ICloneable<Skill> {
    private String name;
    private String description;

    public Skill(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Skill{name='" + name + "', description='" + description + "'}";
    }

    @Override
    public Skill clone() {
        return new Skill(this.name, this.description);
    }
}
