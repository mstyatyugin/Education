package Stepik8_2;

import java.util.Scanner;

public class Stepik8_2<length, i> {
    static Scanner sc = new Scanner(System.in);
    static int[][] array;
    static int n;


    public static void main(String[] args) {

        //task1();
        task2();

    }

    public static void task1() {

        int i = sc.nextInt();
        int j = sc.nextInt();
        int[][] array = new int[i][j];

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void task2() {
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}






