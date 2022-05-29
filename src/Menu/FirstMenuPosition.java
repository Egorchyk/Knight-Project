package Menu;

import ObjectProject.ObjectKnight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstMenuPosition {
    public static void firstMenuPosition() {
        System.out.println("1. Вывести всю информация о рыцаре");
        System.out.println("2. Вывести боевую информацию рыцаря");
        System.out.println("3. Вернуться в главное меню");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Можно вводить только числа\n");
            firstMenuPosition();
        }
        switch (menuPosition) {
            case 1:
                ObjectKnight.getAllInfoKnight();
                infoAmmunition();
                break;
            case 2:
                ObjectKnight.getCombatInfo();
                infoAmmunition();
                break;
            case 3:
                MenuZero.getMenu();
                break;
            default:
                System.out.println("Выбранной позиции нет в меню.");
                System.out.println("Попробуйте еще раз!\n" );
                firstMenuPosition();
                break;
        }
    }
    public static void infoAmmunition() {
        System.out.println("\n1. Подробнее о оружии");
        System.out.println("2. Подробнее о броне");
        System.out.println("3. Назад");
        System.out.println("4. В главное меню");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Можно вводить только числа\n");
            firstMenuPosition();
        }
        switch (menuPosition) {
            case 1:
                ObjectKnight.infoWeaponKnight();
                backMenu();
                break;
            case 2:
                ObjectKnight.infoArmorKnight();
                backMenu();
                break;
            case 3:
                firstMenuPosition();
                break;
            case 4:
                MenuZero.getMenu();
                break;
            default:
                System.out.println("Выбранной позиции нет в меню.");
                System.out.println("Попробуйте еще раз!\n" );
                infoAmmunition();
                break;
        }
    }
    public static void backMenu() {
        System.out.println("\n1. Назад");
        System.out.println("2. В главное меню");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Можно вводить только числа\n");
            firstMenuPosition();
        }
        switch (menuPosition) {
            case 1:
                infoAmmunition();
                break;
            case 2:
                MenuZero.getMenu();
                break;
            default:
                System.out.println("Выбранной позиции нет в меню.");
                System.out.println("Попробуйте еще раз!\n" );
                backMenu();
                break;
        }
    }
}
