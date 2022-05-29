package Menu;

import Ammunitions.Ammunition;
import ObjectProject.ObjectArmor;
import ObjectProject.ObjectWeapon;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveMenuPosition {

    public static void getArmorOrWeapon() {
        System.out.println("1. Подобрать оружие");
        System.out.println("2. Подобрать броню");
        System.out.println("3. Вернуться назад");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            menuPosition = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Можно воодить только числа");
            getArmorOrWeapon();
        }

        ArrayList<Ammunition> weapons = new ArrayList<>();
        ArrayList<Ammunition> armors = new ArrayList<>();
        switch (menuPosition) {
            case 1:
                ObjectWeapon.getArrayListWeapon(weapons);
                menuSearch(weapons);
                break;
            case 2:
                ObjectArmor.getArrayListArmor(armors);
                menuSearch(armors);
                break;
            case 3:
                MenuZero.getMenu();
            default:
                System.out.println("Введеного номера нет в списке.\nПопробуйте еще раз.\n");
                getArmorOrWeapon();

        }
    }

    static void menuSearch(ArrayList<Ammunition> arrayList) {
        System.out.println("Выберите поле поиска:");
        System.out.println("1. Стоимость");
        System.out.println("2. Вес");
        System.out.println("3. Вернуться назад");

        int positionMenuSearch = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            positionMenuSearch = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Можно вводить только числа\n");
            menuSearch(arrayList);
        }
        switch (positionMenuSearch) {
            case 1:
                getSearchPrice(arrayList);
            case 2:
                getSearchWeight(arrayList);
            case 3:
                getArmorOrWeapon();
            default:
                System.out.println("Введеного номера нет в списке.\nПопробуйте еще раз.\n");
                menuSearch(arrayList);
        }
    }

    static void getSearchPrice(ArrayList<Ammunition> arrayList) {
        System.out.println("Минимальная стоимость: 0");
        System.out.println("Максимальная стоимость: 5");
        int price = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            price = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(arrayList);
        }
        if (price < 0 || price > 5) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(arrayList);
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (price == arrayList.get(i).getPrice()) {
                    System.out.println(arrayList.get(i).getName() + ". Цена " + arrayList.get(i).getPrice());
                }
            }
        }
    }
    static void getSearchWeight(ArrayList<Ammunition> arrayList) {
        System.out.println("Минимальный вес: 0");
        System.out.println("Максимальный вес: 35");
        int weightScan = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            weightScan = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(arrayList);
        }
        int indexArrayAmmunition = 0;
        if (weightScan < 0 || weightScan > 35) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(arrayList);
        } else {
            for (int i = 0; i < arrayList.size(); i++) {

                int numSimilar = Integer.MIN_VALUE;
                int weightArray = weightScan - arrayList.get(i).getWeight();
                if (numSimilar > weightArray) {
                    indexArrayAmmunition = i;
                } else {
                    numSimilar = weightArray;
                }
            }
            String namePrint = arrayList.get(indexArrayAmmunition).getName();
            int weightPrint = arrayList.get(indexArrayAmmunition).getWeight();
            System.out.println("Ближайшее значение: \n" + namePrint + ". Вес: " + weightPrint);
        }
    }
}
