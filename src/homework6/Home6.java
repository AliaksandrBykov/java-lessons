package homework6;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Home6 {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Введите год: ");
//
//        int year = Integer.parseInt(reader.nextLine());
//
//        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
//            System.out.println("високосный год");
//        } else
//        if (year % 4 == 0 && year%100!=0 ) {
//            System.out.println("високосный год");
//        } else
//        {
//            System.out.println("Год не високосный");
//        }


        double price = 0.5;
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        int howMuchIWant = scanner.nextInt();
        if (price * howMuchIWant <= money ){
            System.out.println("Можно купить");
        }


    }




}




