package ObjectProject;

import Ammunitions.Ammunition;
import Ammunitions.Armor;

import java.util.ArrayList;

public class ObjectArmor {
    public static void getArrayListArmor(ArrayList<Ammunition> armors) {

        ArrayList<Ammunition> armorArrayList = new ArrayList<>();

        armorArrayList.add(new Armor("Старые труселя", 0, 1, 3));
        armorArrayList.add(new Armor("Доспехи школы волка", 4, 15, 20));
        armorArrayList.add(new Armor("Тяжелые доспехи", 3, 35, 30));
        armorArrayList.add(new Armor("Костюм клоуна", 2, 2, 5));
        armorArrayList.add(new Armor("Костюм железного человека", 5, 10, 50));

        armors.addAll(armorArrayList);
    }
}

