
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int r=0,s=0;
        for (int[] a : accounts) {
            s=0;
            for (int m : a) {
                s+=m;
            }
            if (r<s){
                r=s;
            }
        }
        System.out.println(r);
    }
}
