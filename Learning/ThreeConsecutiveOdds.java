public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr={1,2,34,3,4,5,7,23,12};
        System.out.println(valid(arr));
    }
    static boolean valid(int[] arr) {
        int c=0;
        for (int i : arr) {
            if(i%2!=0){
                c++;
                if (c==3){
                    return true;
                }
            }
            else{
                c=0;
            }
        }
        return false;
    }
}