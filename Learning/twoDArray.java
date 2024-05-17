import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // int[][] arr={
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9},
        // };

        //taking values...
        int[][] arr1=new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j]=input.nextInt();
            }
        }
        // using for each printing each row... 
        for (int[] r : arr1) {
            System.out.println(Arrays.toString(r));
        }
        //using for each printing each element...
        for (int[] r : arr1) {
            for (int s : r) {
                System.out.print(s+" ");
            }
            System.out.println();
        }

        input.close();
    }
}
