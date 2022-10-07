package homework5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main (String[] args){
        boolean isSunny = true;
        boolean isWindy = false;
        boolean canSwim = isSunny && !isWindy;
        System.out.println("Можем ли мы плавать ? " + canSwim);

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Могу ли я сходить в магазин и купить продукты? " + canBuy);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isDividedFor4And6(number));


        int length = 3;
        boolean isLessThan7 = length<7; // Не много не понял как сделать это задание №4
    }
        static boolean isDividedFor4And6(int number){
        boolean isDividedFor4 = number % 4 == 0;
        boolean isDividedFor6 = number % 6 == 0;
        return isDividedFor4 && isDividedFor6;




    }
    



    }

