package Ammunitions;

public class Ammunition {
    private final String name;
    private final int price;
    private final int weight;

    public Ammunition(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + ", Цена = " + price + "; Вес = " + weight;
    }
}
