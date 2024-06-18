public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] a ={2,6,0,7,5,8};
        int Largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>Largest){
                SecondLargest=Largest;
                Largest=a[i];
            }
            else if(a[i]>SecondLargest && a[i]!=Largest){
                SecondLargest=a[i];
            }
        }
        System.out.println(SecondLargest);
        // int Smallest=Integer.MAX_VALUE;
        // int SecondSmallest=Integer.MAX_VALUE;
        // for (int i = 0; i < a.length; i++) {
        //     if(a[i]<Smallest){
        //         SecondSmallest=Smallest;
        //         Smallest=a[i];
        //     }
        //     else if(a[i]<SecondSmallest && a[i]!=Smallest){
        //         SecondSmallest=a[i];
        //     }
        // }
        // System.out.println(SecondSmallest);
    }
}