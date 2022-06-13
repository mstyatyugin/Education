package Stepik7_3;

import java.util.Scanner;

public class Stepik7_3 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        //task2();
        //task3();

    }

    public static void task1() {
        int n;
        String bufer;
        System.out.println("Запишите последовательность, в которой будет есть хотя бы одно число и в конце нее всегда есть 0 !");
        System.out.print("Введите число ");
        n = scan.nextInt();
        bufer = n + " ";
        while (n != 0) {
            System.out.print("Введите число ");
            n = scan.nextInt();
            bufer = bufer + n + " ";
        }
        String[] temp = bufer.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (Integer.parseInt(temp[i]) > 0) {
                //    System.out.printf("%s ", temp[i]);
                System.out.print(temp[i] + " ");


            }
        }
    }

    public static void task2() {
        int n = 1;
        System.out.println("Введите высоту пирамиды");
        int heightOfPyramide;
        heightOfPyramide = scan.nextInt();
        for (int i = 0; i <= heightOfPyramide; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(n + j + " ");
            }
        }
    }


    public static void task3() {
        int n;
        int counter = 0;
        do {
            n = scan.nextInt();
            if (n < 0 && n != -9999) {
                counter++;
            }
        } while (n != -9999);
        if (counter > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}









