package homework10;

public class HomeWork10 {
    public static void main (String[]args){
        int num = 10;
        int a = 1;
        while(a <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, a, num * a);
            a++;
        }

        String iStudy = "Я всегда делаю домашнее задание";
        System.out.println(iStudy.replace('а','А'));

        int hight = 20;
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < hight - i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("^");
                
            }
            System.out.println("");

            
        }
    }
}
