
import java.util.Arrays;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int t=nums[i];
            ans[i]=nums[t];
        }
        System.out.println(Arrays.toString(ans));
    }
}
