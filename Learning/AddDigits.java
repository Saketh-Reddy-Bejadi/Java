public class AddDigits {
    public static void main(String[] args) {
        int num=38;
        while(num>9){
            int t=num,s=0;
            while(t>0){
                s+=t%10;
                t/=10;
            }
            num=s;
        }
        System.out.println(num);
    }
}
