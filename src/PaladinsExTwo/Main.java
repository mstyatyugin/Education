package FromPaladins;

import java.util.Scanner;

public class PaladinsExTwo {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value1 = scan.nextInt();
        if (value1 > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Число меньше 10");
        }
    }
}



