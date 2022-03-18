package PaladinsExTwo;

import java.util.Scanner;

public class PaladinsExTwoCase1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        if (value > 10) {
            System.out.println("Число больше 10");
        } else if (value < 10) {
            System.out.println("Число меньше 10");
        } else {
            System.out.println("Число равно 10");
        }
    }
}



