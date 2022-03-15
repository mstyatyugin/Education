package LiveCodingThree;

import java.util.Scanner;

public class LiveCodingThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение К");
        int k = checkInteger();
        if (k < 1 || k > 99) {
            System.out.println("Столько не живут!!!");
        } else if (k >= 10 && k <= 19) {
            System.out.println("Мне " + k + " лет");
        } else if (k % 10 == 1) {
            System.out.println("мне " + k + " год");
        } else if (k % 10 == 2 || k % 10 == 3 || k % 10 == 4) {
            System.out.println("мне " + k + " года");
        } else {
            System.out.println("мне " + k + " лет");
        }
    }

    public static int checkInteger() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("это не целое число");
            sc.next();
        }
        return sc.nextInt();
    }
}
