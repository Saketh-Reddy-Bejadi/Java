import java.util.Arrays;
import java.util.Scanner;

public class ArrayValuesP {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr =new int[5]; //arr initialization and declaration of arr [array]...
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();  //way of assigning the value using index and for loop...
        }
        System.out.println(Arrays.toString(arr));

        //printing only values rather then array directly using for loop and for each...
        for (int i = 0; i < arr.length; i++) {  //iterate through indices[0,1,2,3,4,5]...
            System.out.print(arr[i]+" ");            
        }
        System.out.println("");
        for (int i : arr) { //iterate through values[10,20,30,40,50]...
            System.out.print(i+" ");            
        }


        input.close();
    }
}
