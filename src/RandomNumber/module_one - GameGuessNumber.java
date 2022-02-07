package RandomNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int answer = (int) (Math.random() * 100 + 1);
        for (int i = 0; i < 10; i++) {
            System.out.println("Угадай число!!!");
            int UserInput = new Scanner(System.in).nextInt();
            if (UserInput == answer) {
                System.out.println("Верно!!!");
            } else if (UserInput > answer) {
                System.out.println("Число больше загаданного");
            } else if (UserInput < answer) {
                System.out.println("Число меньше загаданного");
            }
        }
    }
}

