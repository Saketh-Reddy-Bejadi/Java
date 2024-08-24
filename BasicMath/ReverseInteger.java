package BasicMath;

import java.util.Scanner;

public class ReverseInteger {
    static int Valid(int N){
        int res=0;
        while(N>0){
            int d=N%10;
            res=(res*10)+d;
            N/=10;

        }

        return res;
    }
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(Valid(N));
        sc.close();
    }
}
