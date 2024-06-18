import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,5,6,7 };
        int k = 3;
        int[] temp = new int[k];
        for (int i = 0; i <k; i++) {
            temp[i]=nums[k+i];
        }
        for (int i = k-1; i >=0; i--) {
            nums[i+k]=nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i]=temp[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
