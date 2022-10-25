package homework9;

import java.util.Random;
import java.util.Scanner;

public class HomewWork9 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int number = random.nextInt();
//        int max = 0;
//        System.out.println(number);
//        if (number > 0) {
//            int lastNumber = number % 10;
//            if (lastNumber > max) {
//                max = lastNumber;
//            }
//
//            number = number / 10;
//            System.out.println(max);
//
//
//            if (number > 0) {
//                int secondNumber = number % 10;
//                if (secondNumber > max) {
//                    max = secondNumber;
//                }
//                System.out.println(max);
//                number = number / 10;
//            }
//            if (number > 0) {
//                int firstNumber = number % 10;
//                if (firstNumber > max) {
//                    max = firstNumber;
//                }
//                System.out.println(max);
//                number = number / 10;
//
//            }
//        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter minimum range value: ");
        int min = keyboard.nextInt();
        System.out.println("Enter maximum range value: ");
        int max = keyboard.nextInt();
        int sum = 0;

        for (int i = min; i < max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("The sum of the odd numbers from  " + min + " to " + max + " are " + sum);

        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");

            a += 7;


        }
    }
}