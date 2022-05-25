package Ammunitions;

public class Weapon extends Ammunition {
    private int impactSpeed;
    private int damage;

    public Weapon(String name, int price, int damage, int weight, int impactSpeed) {
        super(name, price, weight);
        this.damage = damage;
        this.impactSpeed = impactSpeed;
    }
}
