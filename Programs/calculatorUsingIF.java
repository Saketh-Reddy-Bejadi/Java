import java.util.Scanner;

public class calculatorUsingIF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter operator:");
        char operator=sc.next().charAt(0);
        System.out.println("Enter any numbers:");
        float a =sc.nextFloat();        
        float b =sc.nextFloat();
        if (operator=='+'){
            System.out.println("Addition of"+a+", "+b+": "+(a+b));
        }else if (operator=='-'){
            System.out.println("Subtraction of"+a+", "+b+": "+(a-b));
        }else if (operator=='*'){
            System.out.println("Product of"+a+", "+b+": "+(a*b));
        }else if (operator=='/'){
            if(b==0){
                System.out.println("Remainder cannot be zero");
            }
            else{
                System.out.println("Division of"+a+", "+b+": "+(a/b));
            }
        }else if (operator=='%'){
            if(b==0){
                System.out.println("Remainder cannot be zero");
            }
            else{
            System.out.println("Modulo of"+a+", "+b+": "+(a%b));
            }
        }else{
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
