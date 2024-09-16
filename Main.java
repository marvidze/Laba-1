import UI.UI;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                UI.input();
                UI.printSimpleNumbers();
                flag = false;
            } catch (Exception e) {
                System.out.println("Произошла ошибка");
            }
        }
    }
}