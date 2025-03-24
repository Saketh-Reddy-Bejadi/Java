public class isPrimeOptimized {
    static boolean isPrime(long n){
        if(n<2) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        long N=(long) Math.sqrt(n);
        for(int i=5;i<=N;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        long n=9223372036854775783L;
        System.out.println(isPrime(n));
    }    
}
