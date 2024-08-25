package BasicMath;

import java.util.Scanner;

public class ReverseInteger {
    static long Valid(long x){
        int sign = x<0 ? -1 : 1;
        x=Math.abs(x);
        long res=0;
        while(x>0){
            int d=(int)x%10;
            res=(res*10)+d;
            x/=10;

        }

        return res*sign;
    }
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextInt();
        System.out.println(Valid(x));
        sc.close();
    }
}
