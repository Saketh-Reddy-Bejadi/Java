package BasicMath;

import java.util.Arrays;

public class ReverseArrayByOne {
    static int[] Valid(int[] arr){
        int last=arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
        System.out.println(Arrays.toString(Valid(arr)));
    }
}
