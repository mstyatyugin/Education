package PaladinsExThree;

import java.util.Scanner;

public class GivenNumber {
    public static void main(String[] args) {
        int i = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите переменную  i  ");
        i = sc.nextInt();
        System.out.println("Введите переменную number ");
        number = sc.nextInt();
        for (number = 0; number < i; number++) {
            System.out.println("Заданное число меньше i, прибавим к нему 1");
            if (number >= i) {
                break;
            }
        }
        System.out.println("Заданное число больше или равно i");

    }
}
