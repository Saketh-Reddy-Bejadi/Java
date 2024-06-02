import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(Linear(arr,k,n));
        sc.close();
    }
    static boolean Linear(int[] arr,int k,int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
}
