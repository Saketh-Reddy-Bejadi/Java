import java.util.ArrayList;
import java.util.Arrays;

public class NumberedDisappeared {
    public static void main(String[] args) {
        ArrayList<Integer> res=new ArrayList<>();
        int[] nums={4,3,2,7,8,2,3,1};
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<=nums[nums.length-1];i++){
            if(nums[j]!=i){
                res.add(i);
            }
            j++;
        }
        System.out.println(res);
    }    
}
