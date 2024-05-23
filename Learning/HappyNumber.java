import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n=19;
        System.out.println(happy(n));
    }
    static boolean happy(int n){
        Set<Integer> UI=new HashSet<>();
        while(true){
            int s=0;
            while(n!=0){
                int d=n%10;
                s+=Math.pow(d, 2.0);
                n/=10;
            }
            if(s==1){
                return true;
            }
            n=s;
            if(UI.contains(n)){
                return false;
            }
            UI.add(n);
        }
    }
}
