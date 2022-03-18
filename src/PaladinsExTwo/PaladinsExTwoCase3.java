package PaladinsExTwo;

import java.util.Scanner;

public class PaladinsExTwoCase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rightAnswer = "мяу";
        System.out.println("Что говорит кошка?");
        String answer = sc.nextLine();
        if (answer.toLowerCase().equals(rightAnswer)) {
            System.out.println("Да, верно.");
        } else {
            System.out.println("Это говорит какое-то другое животное...");
        }
    }
}
