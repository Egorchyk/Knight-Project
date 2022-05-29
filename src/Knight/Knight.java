package Knight;

import Ammunitions.Armor;
import Ammunitions.Weapon;

public class Knight {
    private String name;
    private int age;
    private int protection;
    private int damage;
    private int weight;
    private Armor armorKnight;
    private Weapon weaponKnight;

    public Knight(String name, int age, int protection, int damage, int weight, Armor armorKnight, Weapon weaponKnight) {
        this.name = name;
        this.age = age;
        this.protection = protection;
        this.damage = damage;
        this.weight = weight;
        this.armorKnight = armorKnight;
        this.weaponKnight = weaponKnight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Armor getArmorKnight() {
        return armorKnight;
    }

    public void setArmorKnight(Armor armorKnight) {
        this.armorKnight = armorKnight;
    }

    public Weapon getWeaponKnight() {
        return weaponKnight;
    }

    public void setWeaponKnight(Weapon weaponKnight) {
        this.weaponKnight = weaponKnight;
    }
}
