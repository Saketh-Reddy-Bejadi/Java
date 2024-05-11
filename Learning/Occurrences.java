import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n=i.nextInt();
        int x=i.nextInt();
        int c=0;
        int t=0;
        while(n>0){
            t=n%10;
            if (t==x){
                c++;
            }
            n/=10;
        }
        System.out.println(c);

        i.close();
    }
}
