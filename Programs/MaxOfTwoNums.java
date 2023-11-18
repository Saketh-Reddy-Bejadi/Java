import java.util.Scanner;

public class MaxOfTwoNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((a>b)?a:b);



        sc.close();
    }
}
