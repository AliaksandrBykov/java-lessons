package homework6;

import java.util.Scanner;

public class HW6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int ageLimit18 = scanner.nextInt();
        System.out.println(over18YearsOldOrUnder18YearsOld(ageLimit18));

    }

    static boolean over18YearsOldOrUnder18YearsOld(int ageLimit18) {
        boolean over18YearsOld = true;
        boolean under18YearsOld = false;
        return over18YearsOld || !under18YearsOld;


    }

    }

