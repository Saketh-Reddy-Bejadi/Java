
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] res=new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            res[i]=nums[i];
            res[i+nums.length]=nums[i];
        }
       
        System.out.println(Arrays.toString(res));
    }
}
