package homework11;

import java.util.Arrays;
import java.util.Random;

public class HW11 {
    public static void main(String[] args) {
        int[] degrees = new int[24];
        Random random = new Random();
        for (int i = 8; i < 20; i++){
            degrees[i] = random.nextInt(10) - 5;
        }
        System.out.println(Arrays.toString(degrees));
        int firstTemp = 0;
        for (int i = 8; i <= 20; i++){
            if (degrees[i] < 0){
                firstTemp = i;
                break;
            }
        }
        System.out.println(firstTemp);
    }
}
