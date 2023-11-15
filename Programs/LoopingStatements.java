import java.util.Scanner;

public class LoopingStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // //for
        // for (int i=1;i<=5;i++) {
        //     System.out.println(i);
        // }

        // //while 
        // int j=1;
        // while (j<=5) {
        //     System.out.println(j);
        //     j++;
        // }


        // //do-while
        // int k=1;
        // do{
        //     System.out.println(k);
        //     k++;
        // }while( k<=5);
        

        // //max
        // System.out.println(Math.max(25.9,Math.max(20, 20.5)));


        //char
        char letter=sc.next().charAt(0);

        if (letter>='a'&&letter<='z') {
            System.err.println("Lower Case");
        }
        else if (letter>='A'&&letter<='Z') {
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Enter Alphabet");
        }
        sc.close();
    }
}
