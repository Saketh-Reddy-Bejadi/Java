import java.util.Arrays;
public class ex {

    public static void main(String[] args){
        int[] arr={1,0,0,1,0,1};
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i++]=arr[j];
                arr[j--]=temp;
            }
            else if(arr[j]==1) {
                j--;
            }
            else{
                i++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        }
}