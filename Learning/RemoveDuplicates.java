import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        // ArrayList<Integer> list = new ArrayList<>();
        // int j=-1;
        // for (int i=0; i<nums.length; i++){
        //     if(nums[i]==j){
        //         continue;
        //     }
        //     else{
        //         list.add(nums[i]);
        //         j=nums[i];
        //     }
        // }
        // System.out.println(list.size());
        Arrays.sort(nums);
        int j=1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        System.out.println(j);
    }
}
