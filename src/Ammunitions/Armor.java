package Ammunitions;

public class Armor extends Ammunition {
    private int armor;

    public Armor(String name, int price, int weight, int armor) {
        super(name, price, weight);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }
}