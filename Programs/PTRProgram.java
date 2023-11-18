import java.util.Scanner;

public class PTRProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle, time, rate:");
        float principle=sc.nextFloat();
        float time=sc.nextFloat();
        float rate=sc.nextFloat();

        float SimpleInterest=(principle*time*rate)/100;

        System.out.println(SimpleInterest);




        sc.close();
    }
}
