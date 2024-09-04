import java.util.Scanner;

public class ClimbingStairs {
    static int climbStairs(int n){
        if(n==1)return 1;
        if(n==2)return 2;
        int i=1,j=1;
        for(int k=2;k<n+1;k++){
            int t=j;
            j=i+j;
            i=t;
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbStairs(n));
        sc.close();
    }
}
