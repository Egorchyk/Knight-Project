package Ammunitions;

public class Armor extends Ammunition {
    private final int armor;

    public Armor(String name, int price, int weight, int armor) {
        super(name, price, weight);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return super.toString() + "; Броня = " + armor;
    }
}