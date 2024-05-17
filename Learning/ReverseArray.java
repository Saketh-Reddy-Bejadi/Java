import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for (int i = 0; i < 5; i++) {
            for (int j =4; j >=0; j--) {
                if(j>i){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        // int i=0;
        // int j=4;
        // while (j>i) {
        //     int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //     i++;
        //     j--;
        // }
        System.out.println(Arrays.toString(arr));
    }
}
