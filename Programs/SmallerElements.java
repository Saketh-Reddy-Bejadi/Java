import java.util.Scanner;

public class SmallerElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[i]=sc.nextInt();
            }
            int c=0;
            for(int a=0;a<n;a++){
                for(int b=a+1;b<n;b++){
                    if(arr[a]>arr[b]){
                        c++;
                    }
                }
            }
            System.out.print(c);
        }
        sc.close();
    }
}
