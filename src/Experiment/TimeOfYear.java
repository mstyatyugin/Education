package Experiment;

import java.util.Scanner;

public class TimeOfYear {
    public static void main(String[] args) {
    System.out.println("Num");
    Scanner userInput = new Scanner(System.in);
    int num;
    num =userInput.nextInt();
        switch(num) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
            case 4:
                System.out.println("Осень");
                break;
        }
    }
}