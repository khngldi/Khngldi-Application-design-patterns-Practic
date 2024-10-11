public class Armor implements ICloneable<Armor> {
    private String name;
    private int defense;

    public Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public Armor clone() {
        return new Armor(this.name, this.defense);
    }

    @Override
    public String toString() {
        return "Armor{name='" + name + "', defense=" + defense + "}";
    }
}
