public class ReverseNumber {
    public static void main(String[] args) {
        int n=12345,sum=0;
        while (n>0) {
            int temp=n%10;
            sum=sum*10+temp;
            n/=10;
        }
        System.out.println(sum);
    }
}
