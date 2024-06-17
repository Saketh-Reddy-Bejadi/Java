import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6};
        int k =2;
        System.out.println(kLargest(nums,k));
    }
    static int kLargest(int[] nums, int k){
        Arrays.sort(nums);
        int i =nums.length-k;
        return nums[i];
    }
}
