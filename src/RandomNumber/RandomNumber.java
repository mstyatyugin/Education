package RandomNumber;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        System.out.println("Угадай число!!!");

        int randomNumber = (int) (Math.random() * 100 + 1);
        for (int i = 0; i < 10; i++) {

            int UserAnswer = new Scanner(System.in).nextInt();
            if (UserAnswer == randomNumber) {
                System.out.println("Верно!!!");
                break;
            } else if (UserAnswer > randomNumber) {
                System.out.println("Число больше загаданного");
            } else {
                System.out.println("Число меньше загаданного");
            }
        }
    }
}