import java.util.Scanner;

public class Celsius2Fahrenheit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Temperature(Celsius):");
        float Celsius=sc.nextFloat();
        float Fahrenheit=(Celsius * 9/5) + 32;
        System.out.println(Fahrenheit);




        sc.close();
    }
}
