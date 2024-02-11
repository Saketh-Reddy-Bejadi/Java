public class Recursion {
    public static long fact(long n) {
        if (n!=0) {
            return n*fact(n-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        long res=fact(4);
        System.out.println(res);
    }
}


