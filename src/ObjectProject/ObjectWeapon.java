package ObjectProject;

import Ammunitions.Ammunition;
import Ammunitions.Weapon;

import java.util.ArrayList;

public class ObjectWeapon {
    public static void getArrayListWeapon(ArrayList<Ammunition> weapons) {

        ArrayList<Ammunition> weaponArrayList = new ArrayList<>();

        weaponArrayList.add(new Weapon("Палка от забора", 1, 10, 2, 20));
        weaponArrayList.add(new Weapon("Меч", 5, 20, 5, 10));
        weaponArrayList.add(new Weapon("Секира", 3, 30, 3, 4));
        weaponArrayList.add(new Weapon("Двуручные мечи", 2, 20, 4, 15));
        weaponArrayList.add(new Weapon("Красаная кнопка", 4, 0, 1, 50));

        weapons.addAll(weaponArrayList);
    }
}
