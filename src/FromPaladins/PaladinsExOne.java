package FromPaladins;

import java.util.Scanner;

public class PaladinsExOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число ");
        int value1 = scan.nextInt();
        System.out.println("Вы ввели " + value1);
        System.out.print("\nВведите второе число ");
        int value2 = scan.nextInt();
        System.out.println("Вы ввели два числа: " + value1 + " и " + value2);
        System.out.println("Сумма чисел =  " + (value1 + value2));
        System.out.println("Разность чисел = " + (value1 - value2));
        System.out.println("Произведение чисел = " + (value1 * value2));
        double quotient = (double) value1 / value2;
        System.out.println("Частное чисел = " + quotient);

        String lastName, name;
        scan.nextLine();
        System.out.println("\nВведите фамилию");
        lastName = scan.nextLine();
        System.out.println("Введите имя");
        name = scan.nextLine();
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        System.out.println("\n Фамилия: " + lastName  );
        System.out.println("Имя: " + name  );
        System.out.println("Возраст: " + age  );
    }
}
