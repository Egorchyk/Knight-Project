package Knight;

import Ammunitions.Armor;
import Ammunitions.Weapon;

public class Knight {
    private String name;
    private int age;
    private int protection;
    private int damage;
    private Armor armor;
    private Weapon weapon;

    public Knight(String name, int age, int protection, int damage, Armor armor, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.protection = protection;
        this.damage = damage;
        this.armor = armor;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
