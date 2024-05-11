import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int n=i.nextInt();
        int e1=0;
        int e2=1;
        int e3=0;
        for(int j=2;j<=n;j++){
            e3=e1+e2;
            e1=e2;
            e2=e3;
        }
        System.out.println(e3);


        i.close();
    }   
}
