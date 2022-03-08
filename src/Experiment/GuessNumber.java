package Experiment;

import java.util.Scanner;

    public class GuessNumber {
        public static void main(String[] args) {
            guessNumber();
        }

        private static void guessNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Угадай число от 0 до 100 с 10 попыток.");
            int counter = 10;
            int number = 50;
            while(counter > 0){
                if (scanner.nextInt() == number){
                    System.out.println("Ты угадал!");
                    return;
                }
                counter --;
            }
            System.out.println("Ты не угадал");
        }
    }
