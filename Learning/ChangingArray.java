import java.util.Arrays;

public class ChangingArray {
    public static void main(String[] args) {
        //value of non-primitive will be changed without even returning form methods after change in the  block because of the value pointing.
        int[] a={1,2,3,4,5};
        // change(arr);
        change1(a);
        System.out.println(Arrays.toString(a));

    }
    static void change(int[] arr){
        arr[0]=6;
    }
    static int[] change1(int[] arr){
        arr[0]=7;
        return arr;
    }
}
