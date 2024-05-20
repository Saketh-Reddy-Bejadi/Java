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
        System.out.println(special(mat));
    }
    static int special(int[][] mat){
        int c=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(mat[i][j]==1){
                    if(valid(mat,i,j)){
                        c+=1;
                    }
                }
            }
        }
        return c;
    }
    static boolean valid(int[][] mat,int i,int j){
        for (int j2 = 0; j2 < mat.length; j2++) {
            if(mat[i][j2]!=0 && mat[j2][j]!=0){
                return false;
            }
        }
        return true;
    }
}
