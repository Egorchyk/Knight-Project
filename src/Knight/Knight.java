package Knight;

import Ammunitions.Armor;
import Ammunitions.Weapon;

public class Knight {
    private final String name;
    private final int age;
    private final int protection;
    private final int damage;
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

    public int getAge() {
        return age;
    }


    public int getProtection() {
        return protection;
    }


    public int getDamage() {
        return damage;
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
