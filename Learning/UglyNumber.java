public class UglyNumber {
    public static void main(String[] args) {
        int n=14;
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        System.out.println(n==1);
    }
}
