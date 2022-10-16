package homework7;

public class HW7 {
    public static void main (String[] args){
        String string = new String();
        int month = 7;
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("лето");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("осень");
                break;
            default:
                System.out.println("Другая пора года");
        }
    }
}
