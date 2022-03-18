package PaladinsExTwo;

import java.util.Scanner;

public class PaladinsExTwoCase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value1: ");
        int value1 = sc.nextInt();
        System.out.println("Enter value2: ");
        int value2 = sc.nextInt();

        boolean statement1;
        boolean statement2;
        statement1 = value1 > value2;
        statement2 = value1 < value2;

        if (statement1 == true) {
            System.out.println("Первое введённое число больше второго");
        } else if (statement2 == true) {
            System.out.println("Первое введённое число меньше второго");
        } else System.out.println("Числа равны");
    }
}
