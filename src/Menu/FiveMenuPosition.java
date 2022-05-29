package Menu;

import Ammunitions.Ammunition;
import Ammunitions.Armor;
import Ammunitions.Weapon;
import ObjectProject.ObjectArmor;
import ObjectProject.ObjectWeapon;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ObjectProject.ObjectKnight.knight;

public class FiveMenuPosition {

    public static void getArmorOrWeapon() {
        System.out.println("1. Подобрать оружие");
        System.out.println("2. Подобрать броню");
        System.out.println("3. Вернуться назад");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Можно воодить только числа");
            getArmorOrWeapon();
        }

        Ammunition[] weapons = new Weapon[5];
        Ammunition[] armors = new Armor[5];
        switch (menuPosition) {
            case 1:
                ObjectWeapon.getArrayWeapon(weapons);
                menuSearch(weapons);
                break;
            case 2:
                ObjectArmor.getArrayArmor(armors);
                menuSearch(armors);
                break;
            case 3:
                MenuZero.getMenu();
            default:
                System.out.println("Введеного номера нет в списке.\nПопробуйте еще раз.\n");
                getArmorOrWeapon();

        }
    }

    static void menuSearch(Ammunition[] ammunition) {
        System.out.println("Выберите поле поиска:");
        System.out.println("1. Стоимость");
        System.out.println("2. Вес");
        System.out.println("3. Вернуться назад");

        int positionMenuSearch = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            positionMenuSearch = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Можно вводить только числа\n");
            menuSearch(ammunition);
        }
        switch (positionMenuSearch) {
            case 1 -> getSearchPrice(ammunition);
            case 2 -> getSearchWeight(ammunition);
            case 3 -> getArmorOrWeapon();
            default -> {
                System.out.println("Введеного номера нет в списке.\nПопробуйте еще раз.\n");
                menuSearch(ammunition);
            }
        }
    }

    static void getSearchPrice(Ammunition[] ammunition) {
        System.out.println("Минимальная стоимость: 0");
        System.out.println("Максимальная стоимость: 5");
        int price = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            price = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(ammunition);
        }
        if (price < 0 || price > 5) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(ammunition);
        } else {
            for (Ammunition value : ammunition) {
                if (price == value.getPrice()) {
                    System.out.println(value.getName() + ". Цена " + value.getPrice());
                    equipKnight(value);
                }
            }
        }
    }

    static void getSearchWeight(Ammunition[] ammunition) {
        System.out.println("Минимальный вес: 0");
        System.out.println("Максимальный вес: 5");
        int price = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            price = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(ammunition);
        }
        if (price < 0 || price > 5) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(ammunition);
        } else {
            for (Ammunition value : ammunition) {
                if (price == value.getWeight()) {
                    System.out.println(value.getName() + ". Вес " + value.getWeight());
                    equipKnight(value);
                }
            }
        }
    }

    static void equipKnight(Ammunition ammunition) {
        System.out.println("1. Снарядить рыцаря");
        System.out.println("2. Найти другое снаяржение");
        System.out.println("3. Выйти в главное меню");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено недопустимое значение\n");
        }
        switch (menuPosition) {
            case 1 -> {
                instOf(ammunition);
                MenuZero.getMenu();
            }
            case 2 -> getArmorOrWeapon();
            case 3 -> MenuZero.getMenu();
            default -> {
                System.out.println("Введеного номера нет в списке.\nПопробуйте еще раз.\n");
                equipKnight(ammunition);
            }
        }
    }
    static void instOf(Ammunition ammunition) {
        if (ammunition instanceof Weapon weapon) {
            knight.setWeaponKnight(weapon);
        } else {
            Armor armor = (Armor) ammunition;
            knight.setArmorKnight(armor);
        }
    }
}
