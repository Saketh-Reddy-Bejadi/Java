package BasicMath;

import java.util.Scanner;

public class ReverseInteger {
    static int Valid(int x){
        int sign = x<0 ? -1 : 1;
        x=Math.abs(x);
        int res=0;
        while(x>0){
            int d=x%10;
            res=(res*10)+d;
            x/=10;

        }

        return res*sign;
    }
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(Valid(x));
        sc.close();
    }
}
