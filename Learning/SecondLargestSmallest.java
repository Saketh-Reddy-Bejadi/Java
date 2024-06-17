import java.util.Arrays;

public class SecondLargestSmallest {

    static int SecondLargest(int[] a,int n){
        int Largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(a[i]>Largest){
                SecondLargest=Largest;
                Largest=a[i];
            }
            else if(a[i]!=Largest && a[i]>SecondLargest){
                SecondLargest=a[i];
            }
        }
        return SecondLargest;
    }
    
    static int SecondSmallest(int[] a,int n){
        int Smallest=Integer.MAX_VALUE;
        int SecondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<Smallest){
                SecondSmallest=Smallest;
                Smallest=a[i];
            }
            else if(a[i]!=Smallest && a[i]<SecondSmallest){
                SecondSmallest=a[i];
            }
        }
        return SecondSmallest;
    }
    public static void main(String[] args) {
        int[] a={7, 2, 4, 7, 5, 1};
        int[] res={SecondLargest(a,a.length),SecondSmallest(a,a.length)};
        System.out.println(Arrays.toString(res));
    }
}