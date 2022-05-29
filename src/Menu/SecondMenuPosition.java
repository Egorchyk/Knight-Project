package Menu;

import ObjectProject.ObjectKnight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondMenuPosition {
    public static void secondMenuPosition() {
        ObjectKnight.infoWeaponKnight();
        System.out.println("");
        ObjectKnight.infoArmorKnight();

        System.out.println("\n1. В главное меню");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            menuPosition = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Можно вводить только числа\n");
            secondMenuPosition();
        }
        if (menuPosition != 1) {
            System.out.println("Выбранной позиции нет в меню.");
            System.out.println("Попробуйте еще раз!\n");
            secondMenuPosition();
        } else {
            MenuZero.getMenu();
        }
    }
}
