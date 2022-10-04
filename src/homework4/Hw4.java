package homework4;

public class Hw4 {
    public static int sum;

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("I love");
        StringBuilder s2 = new StringBuilder(" Java ");
        StringBuilder s = s1.append(s2);
        System.out.println(s.toString());


//
        double Fahrenheit = 50.0, Celsius = 0.0;
        Celsius = ((Fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in celsius is: " + Celsius);

        double celsius = 50.0, fahrenheit = 0.0;
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(" value of temperature in fahrenheit:" + fahrenheit);

        int n1 = 225, n2 = 115, n3=14;
        int sum1 = sum;
        sum = n1 + n2 + n3;
        System.out.println("The sum of numbers is: " + sum);
    }
    }




