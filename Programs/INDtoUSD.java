import java.util.Scanner;

public class INDtoUSD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter currency:");
        int IND=sc.nextInt();
        float US=(IND/83.29f);
        String USD=String.format("%.3f", US);
        System.out.println(IND+" rupees is equal to "+USD+" dollars");


        sc.close();
    }
}
