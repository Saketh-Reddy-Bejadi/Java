import java.lang.System;
import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        // type conversion
        // float a=20.567f;
        // System.out.println((int)(a));

        // Arithmetic operators
        // Binary
        // int a =sc.nextInt();
        // int b =sc.nextInt();
        // System.out.println("Addition:"+(a+b));
        // System.out.println("Difference:"+(a-b));
        // System.out.println("Product:"+(a*b));
        // System.out.println("Division:"+(a/b));
        // System.out.println("Modulo:"+a%b);

        // // Unary
        // int c=10;
        // int d=c++;
        // System.out.println(c);
        // System.out.println(d);
 
        // int e=10, f=13;
        // if(e<20){
        //     System.out.println(e);
        // }
        // else if(e==10){
        //     System.out.println(f);
        // }
        // else{
        //     System.out.println(10);
        // }


        // Switch statement
        // int i=0;
        // switch(i) {
        //     case 1 : System.out.println(1);
        //     break;
        //     case 2 : System.out.println(2);
        //     break;
        //     case 3 : System.out.println(3);
        //     break;
        //     default : System.out.println("NAN");
        // }



        //sum of n natural numbers
        // int n=sc.nextInt();
        //             int m=0;
        // for(int i=1;i<=n;i++) {
        //     m+=i;
        // }
        // System.out.println(m);


        //reverse a number
        // int n=1212003;
        // while(n>0) {
        //     int lastDigit=n%10;
        //     System.out.print(lastDigit);
        //     n/=10;
        // }

        // sum of individual
        int n=123;
                    int sum=0;

        while(n>0) {
            int m=n%10;
            sum+=m;
            n/=10;
        }
        System.out.println(sum);



        sc.close();

    }
}