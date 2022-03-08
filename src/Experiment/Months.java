package Experiment;


import java.util.Scanner;

public class Months {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер месяца");
            int monthNumber = scanner.nextInt();
            if (monthNumber >=3 && monthNumber <=5){
                System.out.println("Это весна!");
            } else {
                System.out.println("Это не весна");
            }
        }
    }

