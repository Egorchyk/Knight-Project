package ObjectProject;

import Ammunitions.Armor;
import Ammunitions.Weapon;
import Knight.Knight;

public class ObjectKnight {
    public static Armor nullArmor = new Armor("Без брони", 0, 0, 0);
    public static Weapon nullWeapon = new Weapon("Без оружия", 0, 0, 0, 0);
    public static Knight knight = new Knight("Васян", 30, 5, 5, 70, nullArmor, nullWeapon);

    public static void getAllInfoKnight() {
        String name = knight.getName();
        int age = knight.getAge();
        int armorKnight = knight.getProtection() + knight.getArmorKnight().getArmor();
        int weightAmmunition = knight.getArmorKnight().getWeight() + knight.getWeaponKnight().getWeight();
        int weightKnight = weightAmmunition + knight.getWeight();
        int damageKnight = knight.getDamage() + knight.getWeaponKnight().getDamage();
        String nameWeaponKnight = knight.getWeaponKnight().getName();
        String nameArmorKnight = knight.getArmorKnight().getName();

        System.out.println("Имя рыцаря: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weightKnight);
        System.out.println("Защита: " + armorKnight);
        System.out.println("Урон: " + damageKnight);
        System.out.println("Оружие: " + knight.getWeaponKnight().getName());
        System.out.println("Броня: " + knight.getArmorKnight().getName());
    }

    public static void getCombatInfo() {
        int armorKnight = knight.getProtection() + knight.getArmorKnight().getArmor();
        int weightAmmunition = knight.getArmorKnight().getWeight() + knight.getWeaponKnight().getWeight();
        int weightKnight = weightAmmunition + knight.getWeight();
        int damageKnight = knight.getDamage() + knight.getWeaponKnight().getDamage();
        String nameWeaponKnight = knight.getWeaponKnight().getName();
        String nameArmorKnight = knight.getArmorKnight().getName();

        System.out.println("Вес: " + weightKnight);
        System.out.println("Защита: " + armorKnight);
        System.out.println("Урон: " + damageKnight);
        System.out.println("Оружие: " + knight.getWeaponKnight().getName());
        System.out.println("Броня: " + knight.getArmorKnight().getName());
    }
    public static void infoWeaponKnight() {
        String nameWeapon = knight.getWeaponKnight().getName();
        int damageWeapon = knight.getWeaponKnight().getDamage();
        int priceWeapon = knight.getWeaponKnight().getPrice();
        int weightWeapon = knight.getWeaponKnight().getWeight();
        int impactSpeedWeapon = knight.getWeaponKnight().getImpactSpeed();

        System.out.println("Название: " + nameWeapon);
        System.out.println("Урон: " + damageWeapon);
        System.out.println("Цена: " + priceWeapon);
        System.out.println("Вес: " + weightWeapon);
        System.out.println("Скорость удара " + impactSpeedWeapon);
    }
    public static void infoArmorKnight() {
        String nameArmor = knight.getArmorKnight().getName();
        int priceArmor = knight.getArmorKnight().getPrice();
        int weightArmor = knight.getArmorKnight().getWeight();
        int armorArmor = knight.getArmorKnight().getArmor();

        System.out.println("Название: " + nameArmor);
        System.out.println("Цена: " + priceArmor);
        System.out.println("Вес: " + weightArmor);
        System.out.println("Защита: " + armorArmor);
    }
}
