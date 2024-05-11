import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int a=i.nextInt();
        int b=i.nextInt();
        int c=i.nextInt();

        int r=a;
        if (b>r) {
            r=b;
        }
        if (c>r){
            r=c;
        }
        System.out.println(r);

        
        i.close();
    }
}