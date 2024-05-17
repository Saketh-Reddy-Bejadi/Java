public class MaxEleArray {
    public static void main(String[] args) {
        int[] arr={1,9,3,4,5};
        int m=arr[0];
        for (int i : arr) {
            if(i>m){
                m=i;
            }
        }
        System.out.println(m);
    }
}
