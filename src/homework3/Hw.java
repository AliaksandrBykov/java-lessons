package homework3;

import java.util.Scanner;

public class Hw {


    public static String iStudyStr;

    public static void main(String[] args) {
        String iStudy = "I study Basic Java";
        System.out.println(iStudy);
        System.out.println(iStudy.charAt(17));
        System.out.println(iStudy.toLowerCase());
        System.out.println(iStudy.toUpperCase());
        System.out.println(iStudy.replace('a','o'));
        System.out.println(iStudy.substring(0 ,14));
        System.out.println(iStudy.contains("Java"));

        char g = 'g';
        int e = g;
        System.out.println(e);

        double percent = (200 / 470.0) * 100;
        System.out.println(percent);

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введите ваше имя");
//        String name = in.nextLine();
//        System.out.println("Hello" + " " + name);

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите ваше имя");
//        String name = in.nextLine();
//        System.out.println("Ваше имя начинается с буквы А" + "  " + name);








    }
}
