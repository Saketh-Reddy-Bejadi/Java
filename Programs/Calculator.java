import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean condition=true;
        while (condition) {
            System.out.println("-----*-MENU OPTIONS-*-----");
            System.err.println("1.Addition\n2.Difference\n3.Product\n4.Division\n5.Modulo\n");
            System.out.print("Choose an operator:");
            int op=sc.nextInt();
            int a,b;
            if (op==1||op==2||op==3||op==4||op==5) {
                System.out.println("Enter a, b values:");
                a=sc.nextInt();
                b=sc.nextInt();
                if (op==1) {
                    System.out.println("Addition of "+a+", "+b+" : "+(a+b));
                }
                else if(op==2){
                    System.out.println("Difference of "+a+", "+b+" : "+(a-b));
                }
                else if(op==3){
                    System.out.println("Product of "+a+", "+b+" : "+(a*b));
                }
                if (!(b==0)) {
                    if(op==4) {
                        System.out.println("Divison of "+a+", "+b+" : "+(a/b));
                    }
                    else if(op==5) {
                        System.out.println("Modulo of "+a+", "+b+" : "+(a%b));
                    }
                else{
                    System.out.println("0 cannot be as denominator");
                }
            }
            }
            System.out.println("Enter 1(continue) ot 0(exit):");
            int i=sc.nextInt();
            condition=i==1?true:false;
        }
        sc.close();
    }

    public void setVisible(boolean b) {
    }
}
