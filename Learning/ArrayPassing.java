import java.util.Arrays;

public class ArrayPassing {
    static int[] change(int[] arr){
        arr[0]=6;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
