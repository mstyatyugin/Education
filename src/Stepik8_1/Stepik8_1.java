package Stepik8_1;

import java.util.Scanner;


public class Stepik8_1 {
    static Scanner sc = new Scanner(System.in);
    static int[] array;

    public static void main(String[] args) {


        task1();
        //task2();
        //task3();
    }

    public static void task1() {
        System.out.println("Введите число N ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ведите элемент номер " + i);
            array[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void task2() {
        System.out.println("Введите число N ");
        String answer = "";
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ведите элемент номер " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n - 1 - i]) {
                answer = "YES";
            } else {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }

    public static void task3() {
        double sum = 0;
        double result;
        System.out.println("Введите число N ");
        String answer = "";
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ведите элемент номер " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        result = sum / n;
        System.out.printf("%.2f", result);
    }
}
