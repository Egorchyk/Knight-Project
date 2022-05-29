package ObjectProject;

import Ammunitions.Ammunition;
import Ammunitions.Weapon;

public class ObjectWeapon {
    public static void getArrayWeapon(Ammunition[] weapons) {

       Ammunition[] weapon = new Ammunition[5];

        weapon[0] = new Weapon("Палка от забора", 1, 10, 2, 20);
        weapon[1] = new Weapon("Меч", 5, 20, 5, 10);
        weapon[2] = new Weapon("Секира", 3, 30, 3, 4);
        weapon[3] = new Weapon("Двуручные мечи", 2, 20, 4, 15);
        weapon[4] = new Weapon("Красаная кнопка", 4, 0, 1, 50);

        System.arraycopy(weapon, 0, weapons, 0, weapon.length);
    }
}
