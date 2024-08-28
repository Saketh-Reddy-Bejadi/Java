import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        System.out.println(Valid(M,N));
        sc.close();
    }
    static ArrayList<Integer> Valid(int M,int N) {
        ArrayList<Integer> primes=new ArrayList<>();
        for(int i=M;i<=N;i++){
            if(i==0 || i==1) continue;
            int flag=1;
            for(int j=2;j<=i/2;++j){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if (flag==1){
                primes.add(i);
            }
        }
        return primes;
    }
}
