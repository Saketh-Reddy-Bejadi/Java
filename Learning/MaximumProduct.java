public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        int m=0;
        for (int i = 0; i < nums.length; i++) {
            int s=0;
            for (int j = i+1; j < nums.length; j++) {
                s=(nums[i]-1)*(nums[j]-1);
                m=Math.max(m, s);
            }
        }
        System.out.println(m);
    }
}
