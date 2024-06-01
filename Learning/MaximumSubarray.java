public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int result=(int)-Math.pow(10, 4);
        int cSum=0;
        for (int i = 0; i < nums.length; i++) {
            cSum+=nums[i];
            result=Math.max(cSum, result);
            if (cSum<0){
                cSum=0;
            }
        }
        System.out.println(result);
    }
}
