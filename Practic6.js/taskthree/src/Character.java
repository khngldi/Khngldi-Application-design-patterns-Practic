import java.util.ArrayList;
import java.util.List;

public class Character implements ICloneable<Character> {
    private String name;
    private int health;
    private int strength;
    private int agility;
    private int intelligence;
    private Weapon weapon;
    private Armor armor;
    private List<Skill> skills = new ArrayList<>();

    public Character(String name, int health, int strength, int agility, int intelligence, Weapon weapon, Armor armor, List<Skill> skills) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.weapon = weapon;
        this.armor = armor;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public Character clone() {
        Weapon clonedWeapon = this.weapon != null ? this.weapon.clone() : null;
        Armor clonedArmor = this.armor != null ? this.armor.clone() : null;

        List<Skill> clonedSkills = new ArrayList<>();
        for (Skill skill : this.skills) {
            clonedSkills.add(skill.clone());
        }

        return new Character(this.name, this.health, this.strength, this.agility, this.intelligence,
                clonedWeapon, clonedArmor, clonedSkills);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", weapon=" + (weapon != null ? weapon.getName() : "None") +
                ", armor=" + (armor != null ? armor.getName() : "None") +
                ", skills=" + skills.stream().map(Skill::getName).toList() +
                '}';
    }
}
