

import java.util.Scanner;

public class SumofDivisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Valid(n));
        sc.close();
    }
    static int Valid(int n) {
        int res = 0;
    
    for (int i = 1; i <= n; i++) {
        res += (n / i) * i;
    }
    
    return res;
    }
}
