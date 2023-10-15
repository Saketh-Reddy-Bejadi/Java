// import java.util.Scanner;
// public class Debugging {
//     public static void main(String args[]) {
//         Scanner input=new  Scanner(System.in);
//         System.out.print("Enter any integer:");
//         int integer=input.nextInt();
//         System.out.println("The integer is: "+integer);
//     }
// }

import java.util.Scanner;

public class sample{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int integer = input.nextInt();
        System.out.println("The integer is: " + integer);

        input.close();
    }
}
