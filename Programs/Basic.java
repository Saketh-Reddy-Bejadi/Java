import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // System.out.print("Enter Int:");
        // int a=sc.nextInt();
        // System.out.println("Int:"+a);

        // System.out.print("Enter Float:");
        // float b=sc.nextFloat();
        // System.out.println("Float:"+b);

        // System.out.print("Enter String(single):");
        // String c=sc.next();
        // System.out.println("String:"+c);

        // System.out.print("Enter String(multiple):");
        // String d=sc.nextLine();
        // System.out.println("String Line:"+d);


        char e=sc.next().charAt(0);
        System.out.println(e);


        sc.close();
    }
}
