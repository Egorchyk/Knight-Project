package Menu;

import Ammunitions.Ammunition;
import Ammunitions.Armor;
import Ammunitions.Weapon;
import ObjectProject.ObjectArmor;
import ObjectProject.ObjectWeapon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import static ObjectProject.ObjectKnight.knight;
import static java.lang.System.*;

public class FourMenuPosition {
    public static void fourMenuPosition() {
        out.println("1. Сортировка оружия");
        out.println("2. Сортировка брони");
        out.println("3. Выйти в главное меню");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            out.println("Можно вводить только числа\n");
            fourMenuPosition();
        }
        Ammunition[] ammunition = new Ammunition[5];
        switch (menuPosition) {
            case 1 -> {
                ObjectWeapon.getArrayWeapon(ammunition);
                sortMenu(ammunition);
            }
            case 2 -> {
                ObjectArmor.getArrayArmor(ammunition);
                sortMenu(ammunition);
            }
            case 3 -> MenuZero.getMenu();
            default -> {
                out.println("Выбранной позиции нет в меню.");
                out.println("Попробуйте еще раз!\n");
                fourMenuPosition();
            }
        }
    }

    static void sortMenu(Ammunition[] ammunition) {
        out.println("1. Сортировка по весу");
        out.println("2. Сортировка по цене");
        out.println("3. Назад");
        out.println("4. Выйти в главное меню");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            out.println("Можно вводить только числа\n");
            sortMenu(ammunition);
        }

        switch (menuPosition) {
            case 1 -> sortWeight(ammunition);
            case 2 -> sortPrice(ammunition);
            case 3 -> fourMenuPosition();
            case 4 -> MenuZero.getMenu();
            default -> {
                out.println("Выбранной позиции нет в меню.");
                out.println("Попробуйте еще раз!\n");
                sortMenu(ammunition);
            }
        }
    }

    static void sortWeight(Ammunition[] ammunition) {
        out.println("Снарядить рыцаря:");
        Ammunition[] ammunitionToEquip = new Ammunition[5];
        Arrays.sort(ammunition, Comparator.comparingInt(Ammunition::getWeight));
        for (int i = 0; i < ammunition.length; i++) {
            ammunitionToEquip[i] = ammunition[i];
            out.println(i + 1 + ". " + ammunition[i]);
        }
        equipKnight(ammunitionToEquip);
    }

    static void sortPrice(Ammunition[] ammunition) {
        out.println("Снарядить рыцаря:");
        Ammunition[] ammunitionToEquip = new Ammunition[5];
        Arrays.sort(ammunition, Comparator.comparingInt(Ammunition::getPrice));
        for (int i = 0; i < ammunition.length; i++) {
            ammunitionToEquip[i] = ammunition[i];
            out.println(i + 1 + ". " + ammunition[i]);
        }
        equipKnight(ammunitionToEquip);
    }

    static void equipKnight(Ammunition[] ammunition) {
        out.println("\n6. Назад");
        out.println("7. Выйти в главное меню");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            out.println("Введено недопустимое значение\n");
        }
        switch (menuPosition) {
            case 1 -> instOfEquip(ammunition[0]);
            case 2 -> instOfEquip(ammunition[1]);
            case 3 -> instOfEquip(ammunition[2]);
            case 4 -> instOfEquip(ammunition[3]);
            case 5 -> instOfEquip(ammunition[4]);
            case 6 -> fourMenuPosition();
            case 7 -> MenuZero.getMenu();
            default -> {
                out.println("Выбранной позиции нет в меню.");
                out.println("Попробуйте еще раз!\n");
                equipKnight(ammunition);
            }
        }
    }

    static void instOfEquip(Ammunition ammunition) {
        if (ammunition instanceof Weapon weapon) {
            knight.setWeaponKnight(weapon);
            MenuZero.getMenu();
        } else if (ammunition instanceof Armor armor) {
            knight.setArmorKnight(armor);
            MenuZero.getMenu();
        }
    }
}