import java.util.Scanner;

public class SumofDigitsPalindrome {
    static int Valid(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        int dup=s;
        int temp=0;
        while(dup>0){
            temp=(temp*10)+(dup%10);
            dup/=10;
        }
        return s==temp?1:0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Valid(n));
        sc.close();
    }
}
