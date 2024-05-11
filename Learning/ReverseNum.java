import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int r=0;
        int n=i.nextInt();
        while(n>0){
            r=r*10+(n%10);
            n/=10;
        }
        System.out.println(r);

        i.close();
    }
}
