import java.util.Arrays;
import java.util.Scanner;

public class ArrayValuesO {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] s=new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i]=input.next();
        }
        System.out.println(Arrays.toString(s));
        for (String i : s) {
            System.out.print(i+" ");
        }


        input.close();
    }
}
