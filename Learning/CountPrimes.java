public class CountPrimes {
    public static void main(String[] args) {
        int n=10,c=0;
        for (int i = 2; i < n; i++) {
            if(n==2 || n==3){
                c++;
            }
            else if(isprime(i)){
                c++;
            }
        }
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