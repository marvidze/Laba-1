package UI;

import java.util.Scanner;
import realization.Number;

public class UI {

    // получает числа с консоли и передаёт в метод splitLine
    static public boolean input() {
        try {
            System.out.println("Введите n чисел");
            @SuppressWarnings("resource")
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            Number.splitLine(line);
        } catch (Exception ex) {
            System.out.println("Произошла ошибка ввода");
            return false;
        }
        return true;

    }

    // выводит простые числа на консоль
    static public void printSimpleNumbers() {
        System.out.println("Простые числа: ");
        String simpleLine = Number.createSimpleLine();
        System.out.println(simpleLine);
    }
}
