import java.util.Arrays;

public class Matrix {
        public static void main(String[] args) {
            int[] nums={3,4,1,2,6};
            int[][] queries={{0,4}};
            int n = nums.length;
            boolean[] result = new boolean[queries.length];
            
            for (int i = 0; i < queries.length; i++) {
                int start = queries[i][0];
                int end = queries[i][1];
                
                boolean isSpecial = true;
                
                for (int j = start; j < end; j++) {
                    if (nums[j] % 2 == nums[j + 1] % 2) {
                        isSpecial = false;
                        break;
                    }
                }
                
                if (start > 0 && nums[start - 1] % 2 == nums[start] % 2) {
                    isSpecial = false;
                }
                
                if (end < n - 1 && nums[end] % 2 == nums[end + 1] % 2) {
                    isSpecial = false;
                }
                
                result[i] = isSpecial;
            }
            
            System.out.println(Arrays.toString(result));
        }
    }

