
import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4};
        int s=0;
        for (int i = 0; i < nums.length; i++) {
            s+=nums[i];
            nums[i]=s;
        }
        System.out.println(Arrays.toString(nums));
    }
}
