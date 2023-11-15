import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int f0=0,f1=1,f2,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of series to be printed:");
        n=sc.nextInt();
        System.out.println(f0+"\n"+f1);
        for(int i=2;i<=n;i++) {
            f2=f1+f0;
            f0=f1;
            f1=f2;
            System.out.println(f2);
        }
        


        sc.close();
    }
}
