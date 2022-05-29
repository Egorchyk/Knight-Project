package Menu;

import java.util.Scanner;

public class MenuZero {
    public static void getMenu() {
        System.out.println("Главное Меню");
        System.out.println("1. Распечатайте статистику рыцаря");
        System.out.println("2. Показать снаряжение");
        System.out.println("3. Снарядить рыцаря");
        System.out.println("4. Сортировать снаряжение");
        System.out.println("5. Поиск снаяржения");
        System.out.println("6. Выход");
        System.out.println("Выберите опцию: ");

        int menuPosition = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            menuPosition = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Можно вводить только числа\n");
            getMenu();
        }

        switch(menuPosition) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                FiveMenuPosition.getArmorOrWeapon();
                break;
            case 6:
                System.out.println("До новых встреч!");
                break;
            default:
                System.out.println("Выбранной позиции нет в меню.");
                System.out.println("Попробуйте еще раз!\n" );
                getMenu();
        }
    }
}
