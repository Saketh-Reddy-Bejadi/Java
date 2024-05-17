import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr={};
        int[] arr1; //this is declaration of array
        arr1=new int[5];  //this is initialization of an array [here actual object is being created]...
        System.out.println(Arrays.toString(arr1)); //we are not able to print array....directly on the console screen. To do that we use Arrays.toString(array_name);...
        int[] arr2=new int[5];
        System.out.println(arr+" "+arr2);

        //by default the values of array of int type will 0's and when it comes to strings the value will be 'null'...

    }
}
