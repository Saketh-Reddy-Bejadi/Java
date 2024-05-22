public class SpecialPositions {
    public static void main(String[] args) {
        int[][] mat={
            // {0,0,0,0,0},
            // {1,0,0,0,0},
            // {0,1,0,0,0},
            // {0,0,1,0,0},
            // {0,0,0,1,1}
            {1,0,0},{0,1,0},{0,0,1}
        };
        int c=0;
        int[] rsum=new int[mat.length];
        int[] csum=new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                rsum[i]+=mat[i][j];
                csum[j]+=mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j]==1 && rsum[i]==1 && csum[j]==1){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
