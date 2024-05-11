import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        char a=i.next().trim().charAt(0);
        if (a>='a' && a<='z' ){
            System.out.println("Lower Case");
        }else if(a>='A' && a<='Z'){
            System.out.println("Upper Case");
        }else{
            System.out.println("Invalid char");
        }

        i.close();
    }
}
