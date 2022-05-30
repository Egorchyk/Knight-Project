package Ammunitions;

public class Weapon extends Ammunition {
    private final int impactSpeed;
    private final int damage;

    public Weapon(String name, int price, int damage, int weight, int impactSpeed) {
        super(name, price, weight);
        this.damage = damage;
        this.impactSpeed = impactSpeed;
    }

    public int getImpactSpeed() {
        return impactSpeed;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return super.toString() + "; Урон = " + damage + "; Скорость Удара = " + impactSpeed;
    }
}
