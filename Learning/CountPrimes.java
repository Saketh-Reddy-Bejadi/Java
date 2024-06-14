import java.util.ArrayList;

public class CountPrimes {
    public static void main(String[] args) {
        int n=10,c=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            if(i==2 || i==3){
                c++;
            }
            else if(isprime(i)){
                list.add(i);
                c++;
            }
        }
        System.out.println(list);
        System.out.println(c);
    }
    static boolean isprime(int n){
        if(n%2==0 || n%3==0){
            return false;
        }
        for (int i = 2; i*i<= n; i=i+6) {
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;

    }
}