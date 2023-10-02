import java.lang.System;
import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        // type conversion
        // float a=20.567f;
        // System.out.println((int)(a));

        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Product:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulo:"+a%b);

        sc.close();

    }
}