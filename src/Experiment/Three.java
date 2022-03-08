package Experiment;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;
        System.out.println("Введите номер месяца");
        month = scan.nextInt();
        if (month >= 3 && month < 6) {
            System.out.println("Весна");
        } else if (month >= 6 && month < 9) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else if (month == 12 || month <= 2 && month >= 1) {

            System.out.println("Зима");
        }
    }
}


