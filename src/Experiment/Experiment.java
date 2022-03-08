package Experiment;

import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
            int a,b,c = 0;
        System.out.println("Введите три числа");
        System.out.print("Первое число:  ");
        Scanner userInput = new Scanner(System.in);
            a = userInput.nextInt();
        System.out.print("Второе число:  ");
         b = userInput.nextInt();
        System.out.print("Третье число:  ");
         int с = userInput.nextInt();

        System.out.println("Сумма чисел: ");
        System.out.print(a + b + c );
    }

}

