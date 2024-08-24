import java.util.Scanner;

public class MartixDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] sum=new int[2*n-1];
            int[][] mat=new int[n][n];
            for(int a=0;a<n;a++){
                for(int b=0;b<n;b++){
                    mat[a][b]=sc.nextInt();
                }
            }
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    int ind=j+k;
                    sum[ind]+=mat[j][k];
                }
            }
            for(int r=0;r<sum.length;r++){
                if(r>0){
                    System.out.print(" ");
                }
                System.out.print(sum[r]);
            }
            System.out.println();

        }
        sc.close();
    }
}
