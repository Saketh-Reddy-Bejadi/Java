import java.util.Arrays;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        int[] nums={1,2,2,1,1,0};
        int j=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[j]){
                nums[i]=nums[i]*2;
                nums[j]=0;
            }
            j++;
        }
        int in=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[in]=nums[i];
                in++;
            }
        }
        while (in<nums.length) {
            nums[in++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}