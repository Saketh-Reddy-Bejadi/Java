package BasicMath;
import java.util.Scanner;

public class CountDigits {
    static int Valid(int N){
        int t=N,c=0;
        while(t>0){
            int digit=t%10;
            if(N%digit==0){
                c++;
            }
            t/=10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(Valid(N));
        sc.close();
    }
}
