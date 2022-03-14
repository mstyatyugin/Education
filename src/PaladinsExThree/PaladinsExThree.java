package PaladinsExThree;

import java.util.Scanner;

public class PaladinsExThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        String month = sc.nextLine();
        writeNumberOfMonth(Integer.parseInt(month));
    }

    public static void writeNumberOfMonth(int month) {

        switch (month) {
            case 1:
                System.out.println("Месяц № " + month + "- Январь, зима.");
                break;
            case 2:
                System.out.println("Месяц № " + month + "- Февраль, зима.");
                break;
            case 3:
                System.out.println("Месяц № " + month + "- Март, весна.");
                break;
            case 4:
                System.out.println("Месяц № " + month + "- Апрель, весна.");
                break;
            case 5:
                System.out.println("Месяц № " + month + "- Май, весна.");
                break;
            case 6:
                System.out.println("Месяц № " + month + "- Июнь, весна.");
                break;
            case 7:
                System.out.println("Месяц № " + month + "- Июль, весна.");
                break;
            case 8:
                System.out.println("Месяц № " + month + "- Август, весна.");
                break;
            case 9:
                System.out.println("Месяц № " + month + "- Сентябрь, весна.");
                break;
            case 10:
                System.out.println("Месяц № " + month + "- Октябрь, весна.");
                break;
            case 11:
                System.out.println("Месяц № " + month + "- Ноябрь, весна.");
                break;
            case 12:
                System.out.println("Месяц № " + month + "- Декабрь, зима.");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }
}
