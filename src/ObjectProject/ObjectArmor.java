package ObjectProject;

import Ammunitions.Ammunition;
import Ammunitions.Armor;

import static java.lang.System.*;

public class ObjectArmor {
    public static void getArrayArmor(Ammunition[] armors) {

        Ammunition[] armor = new Ammunition[5];

        armor[0] = new Armor("Старые труселя", 0, 1, 3);
        armor[1] = new Armor("Доспехи школы волка", 1, 4, 20);
        armor[2] = new Armor("Тяжелые доспехи", 3, 3, 30);
        armor[3] = new Armor("Костюм клоуна", 2, 2, 5);
        armor[4] = new Armor("Костюм железного человека", 5, 5, 50);

        arraycopy(armor, 0, armors, 0, armor.length);
    }
}

