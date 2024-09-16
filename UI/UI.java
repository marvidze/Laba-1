package UI;

import java.util.Scanner;
import realization.Number;

public class UI {
    /*
     * выводит на консоль
     */
    static public void print(String line) {
        System.out.println(line);
    }

    static public boolean input() {
        try {
            UI.print("Введите n чисел");
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

    static public void printSimpleNumbers() {
        System.out.println("Простые числа: ");
        String simpleLine = Number.createSimpleLine();
        System.out.println(simpleLine);
    }
}
