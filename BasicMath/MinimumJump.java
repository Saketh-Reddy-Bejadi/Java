

import java.util.Scanner;

public class MinimumJump {
    static int Valid(int[] arr, int n) {
        int count=0;
        int i = 0;
        while(i<n-1){
            if(arr[i]==0 && i<n){
                return -1;
            }
            i+=arr[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Valid(arr, n));
        sc.close();
    }
}
