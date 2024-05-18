import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] a={0,1,0};
        // int j=a.length-1;
        // int t=0;
        // for (int i = 0; i < a.length; i++) {
        //     if(a[i]==0 && i<j){
        //         t=a[i];
        //         a[i]=a[j];
        //         a[j]=t;
        //         j--;
        //     }
        // }
        // if(a.length>3){
        //     j=a.length-j;
        //     Arrays.sort(a,0,j);
        // }
        int in=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                a[in]=a[i];
                in++;
            }
        }
        while (in<a.length) {
            a[in++]=0;
        }
        System.out.println(Arrays.toString(a));
    }
}
