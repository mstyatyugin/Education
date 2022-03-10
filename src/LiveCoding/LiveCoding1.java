package LiveCoding;

import java.util.Scanner;

public class LiveCoding1 {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first variable");
        int value1 = userInput.nextInt();
        System.out.println("Enter second variable");
        int value2 = userInput.nextInt();

        System.out.println("\nEnter the number of the operation: 1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int operationNumber = checkInt();

        switch (operationNumber) {
            case 1:
                System.out.println("Addition = " + Addition(value1, value2));
                break;
            case 2:
                System.out.println("Subtraction = " + Difference(value1, value2));
                break;
            case 3:
                System.out.println("Multiplication = " + Multiplication(value1, value2));
                break;
            case 4:
                System.out.println("Division = " + Division(value1, value2));
                break;
            default:
                System.out.println("Operation is undetermined");
        }
    }

    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Difference(int x, int y) {
        return x - y;
    }

    public static int Multiplication(int x, int y) {
        return x * y;
    }

    public static double Division(int x, int y) {
        return (double) x / y;
    }

    public static int checkInt() {
        while (!userInput.hasNextInt()) {
            System.out.println("Вы ввели не число!");
            userInput.next();
        }
        return userInput.nextInt();
    }
}

