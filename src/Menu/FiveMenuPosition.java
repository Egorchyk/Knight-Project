package Menu;

import Ammunitions.Ammunition;
import ObjectProject.ObjectArmor;
import ObjectProject.ObjectWeapon;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
        } catch (InputMismatchException e) {
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
        } catch (InputMismatchException e) {
            System.out.println("Можно вводить только числа\n");
            menuSearch(arrayList);
        }
        switch (positionMenuSearch) {
            case 1:
                getSearchPrice(arrayList);
                break;
            case 2:
                getSearchWeight(arrayList);
                break;
            case 3:
                getArmorOrWeapon();
                break;
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
        } catch (InputMismatchException e) {
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
                    equipKnight(arrayList.get(i));
                }
            }
        }
    }

    static void getSearchWeight(ArrayList<Ammunition> arrayList) {
        System.out.println("Минимальный вес: 0");
        System.out.println("Максимальный вес: 5");
        int price = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            price = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(arrayList);
        }
        if (price < 0 || price > 5) {
            System.out.println("Введено недопустимое значение\n");
            getSearchPrice(arrayList);
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (price == arrayList.get(i).getWeight()) {
                    System.out.println(arrayList.get(i).getName() + ". Вес " + arrayList.get(i).getWeight());
                    equipKnight(arrayList.get(i));
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
            case 1:
            case 2:
                getArmorOrWeapon();
                break;
            case 3:
                MenuZero.getMenu();
                break;
            default:
                System.out.println("Введеного номера нет в списке.\nПопробуйте еще раз.\n");
                equipKnight(ammunition);
        }
    }
}
