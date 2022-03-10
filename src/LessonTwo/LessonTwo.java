package LessonTwo;

import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args) {

        int a = 10;
        int b = 8;
        System.out.println(printSum(a, b));//14
        System.out.println(printSum(a, 3));//9
        System.out.println(printSum(5, 23));//28

        boolean isAGreaterThenB = a > b;
        boolean isALessThenB = a < b;
        boolean isAGreaterOrEqualThenB = a >= b;
        boolean isALessOrEqualThenB = a <= b;

        if (isAGreaterOrEqualThenB) {
            System.out.println("a>b");

        } else {
            System.out.println("False");
            if (isALessThenB) {
                System.out.println("a<b");
            }
            if (isAGreaterOrEqualThenB) {
                System.out.println("a>=b");
            }
            if (isALessOrEqualThenB) {
                System.out.println("a<=b");
            } else {
                System.out.println("False");
            }
            int userInput = new Scanner(System.in).nextInt();
            if (userInput % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное ");
            }
        }
    }

    static int printSum(int x, int y) {
        return (x + y);
    }
}
