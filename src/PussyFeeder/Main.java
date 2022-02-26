package PussyFeeder;

import java.util.Scanner;

public class Main {
    static String[][] cats = {{"Рыжик", "2"}, {"Мурзик", "3"}, {"Барсик", "5"}, {"Васька", "4"}};
    // static int[] catsBowl = new int[]{2, 3, 5, 4};

    public static void main(String[] args) {
        printCatsAndBowl();
        System.out.println();
        System.out.println();
        printMenu();
        Scanner menuScan = new Scanner(System.in);
        int userInput = menuScan.nextInt();
        choiseCat();
        //System.out.println(catsBowl[1]);
    }

    public static void printCatsAndBowl () {
        for ( int i=0; i< cats.length; i++ ){
            //System.out.println(cats[i][0] + " " + cats [i][1] );
            System.out.printf("\n%-6s %2s (пакетов)", cats [i][0], cats [i][1]);
        }

    }

    private static void printMenu() {
        System.out.println("Выберите, что вы хотите сделать: ");
        System.out.println("1 - Добавить/убавить еды у конкретного кота: ");
        System.out.println("2 - Добавить/убавить еды у всех котов сразу: ");
        System.out.println("3 - Добавить/убавить еды у четрных/нечетных котов сразу: ");
        System.out.println("4 - Написать 666 для выхода из программы. ");
    }

    private static void choiseCat() {

        System.out.println("Выберите конкретного кота: ");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(i + 1 + " " + cats[i][0]);
        }
        Scanner sc = new Scanner(System.in);
        int choiseCat = sc.nextInt();

        System.out.println("Введите количество корма: ");
        int food = sc.nextInt();

        //catsBowl[choiseCat] = catsBowl[choiseCat] + food;
        //cats [i]
    }

    public static void volumeCatsBowl() {
        System.out.println("Количество корма у каждого кота: ");
        //int volumeCatsBowl = sc.nextInt

    }
}
