public class Weapon implements ICloneable<Weapon> {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public Weapon clone() {
        return new Weapon(this.name, this.damage);
    }

    @Override
    public String toString() {
        return "Weapon{name='" + name + "', damage=" + damage + "}";
    }
}
