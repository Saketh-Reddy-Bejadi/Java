public class GridSatisfies {
    public static void main(String[] args) {
        int[][] grid={
            {1,1,1},
            {2,2,2}
        };
        System.out.println(satisfy(grid));
    }
    static boolean satisfy(int[][] g){
        for (int i = 0; i < g.length-1; i++) {
            for (int j = 0; j < g.length; j++) {
                if(g[i][j]!=g[i+1][j]){
                  return false;  
                }
            }
        }
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length-1; j++) {
                if (g[i][j]==g[i][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
