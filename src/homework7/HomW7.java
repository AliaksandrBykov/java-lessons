package homework7;

import java.util.Random;

public class HomW7 {
    public static void main(String[] args){
        Random random = new Random();
        int entrance = random.nextInt(91) + 1;
        System.out.println(entrance);
        if (entrance <= 20){
            System.out.println("Первый подъезд");
        }
        else if (entrance <= 48){
            System.out.println("Второй подъезд");

        }
        else if (entrance <= 90) {
            System.out.println("Третий подъезд");}
    }
}
