package ObjectProject;

import Ammunitions.Armor;
import Ammunitions.Weapon;
import Knight.Knight;

public class ObjectKnight {
    public static Armor nullArmor = new Armor("Без брони", 0, 0, 0);
    public static Weapon nullWeapon = new Weapon("Без оружия", 0, 0, 0, 0);
    public static Knight knight = new Knight("Васян", 30, 3, 5, nullArmor, nullWeapon);

}
