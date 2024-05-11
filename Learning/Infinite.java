import java.util.Scanner;

public class Infinite {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        while(true){
            char op=i.next().trim().charAt(0);
            if (op=='X' || op=='x'){
                break;
            }
            else{
                if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%' ){
                    System.out.println("Enter values:");
                    int a=i.nextInt();
                    int b=i.nextInt();
                    if(op=='+'){
                        System.out.println(a+b);
                    } 
                    else if(op=='-'){
                        System.out.println(a-b);
                    }else if(op=='*'){
                        System.out.println(a*b);
                    }else if(op=='/'){
                        System.out.println(a/b);
                    }else if(op=='%'){
                        System.out.println(a%b);
                    } else{
                        System.out.println("Invalid operator");
                    }
                }
                else{
                    System.out.println("Invalid operator");
                    break;
                }
            }
        }

        i.close();
    }
}
